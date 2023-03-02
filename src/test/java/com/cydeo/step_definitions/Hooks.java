package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println(" Before scenario is running");
    }

    @After
    public  void teardown(){
        System.out.println(" After scenario is stopped");
    }
}
