package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

/*
In this class we will be able to pass pre-post conditions to each scenario and each step
 */
public class Hooks {
    // import from io.cucumber.java, not from junit
    @Before
    public void setupScenario(){
        System.out.println("====Setting up browser using cucumber @Before");
    }

    @Before (value = "@login",order = 1)
    public void setupScenarioForLogins(){
        System.out.println("====This will only apply to scenarios with @login tag");
    }

    @Before (value = "@db",order = -1)
    public void setupForDatabaseScenarios(){
        System.out.println("====This will only apply to scenarios with @db tag");
    }

    @After
    public void teardownScenario(){
        System.out.println("====Closing browser using cucumber @After");
        System.out.println("====Scenario ended/Take screenshot if failed");
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("=====> Applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("=====> Applying teardown using @AfterStep");
    }


}
