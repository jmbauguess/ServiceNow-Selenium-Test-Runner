package com.company.servicenowtests.rules;

import com.company.servicenowtests.annotations.ServiceNowTest;
import com.google.api.client.util.Base64;
import java.util.Arrays;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

/**
 * Handles a report to ServiceNow after a test completes
 * @author Justin Bauguess
 */
public class ServiceNowReportingRule extends TestWatcher {

    private final String endpoint = ".service-now.com/api/now/table/";

    @Override
    protected void failed(Throwable e, Description description) {
        try {
            ServiceNowTest testinfo = (ServiceNowTest) description
                    .getAnnotation(ServiceNowTest.class);
            String error = "An unexpected alert opened";
            if (!e.getMessage().contains("unexpected alert open")) {                
                error = e.getMessage();            
            }
            postResultToServiceNow(testinfo.testName(), "failed", 
                    testinfo.description(), testinfo.expected(), error,
                    Arrays.toString(testinfo.stories())
                            .replace("[", "")
                            .replace("]", ""));
        } catch (Exception ex) {}  
    }

    @Override
    protected void succeeded(Description description) {        
        try {
            ServiceNowTest testinfo = (ServiceNowTest) description
                    .getAnnotation(ServiceNowTest.class);
            postResultToServiceNow(testinfo.testName(), "passed", 
                    testinfo.description(), testinfo.expected(), 
                    testinfo.expected(),
                    Arrays.toString(testinfo.stories())
                            .replace("[", "")
                            .replace("]", ""));
        } catch (Exception ex) {
            
        }    
    }

    public void postResultToServiceNow(String name, String status, 
            String description, String expected, String actual, String stories){
        HttpClient httpclient = HttpClients.createDefault();
        HttpPost httppost = new HttpPost("https://production" + endpoint + 
                "tm_test_instance");
        httppost.addHeader("Content-Type", "application/json");
        String authString = "1.Selenium.Test:" + System.getProperty("password");
        String authStringEnc = new String(Base64
                .encodeBase64(authString.getBytes()));
        httppost.addHeader("Authorization", "Basic " + authStringEnc);
        try {
            StringEntity entity = new StringEntity("{'order': '0'" + 
                    ",'test':'" + name +
                    "', 'execution_status':'" + status + 
                    "', 'expected_result':'" + expected +
                    "', 'test_description':'" + description + 
                    "', 'u_stories':'" + stories +
                    "', 'u_automated' : true" +
                    ", 'actual_result': '" + actual +
                    "'}");
            httppost.setEntity(entity);
            HttpResponse response = httpclient.execute(httppost);
        } catch (Exception e) { }

    }

}
