package com.company.servicenowtests.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Describes what happens in a ServiceNow test so that it can be inserted into the Test Instance table upon completion
 * @author Justin Bauguess
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ServiceNowTest {
    
    /**
     * The name of the test (test field)
     * @return The name of the test
     */
    String testName();
    /**
     * A description of what the test is doing
     * @return A description of the test
     */
    String description();
    /**
     * What a passing test should do
     * @return What the passing test should do
     */
    String expected();
    /**
     * A list of stories tested by the test case
     * @return An array of stories tested by the test case
     */
    String[] stories();
}