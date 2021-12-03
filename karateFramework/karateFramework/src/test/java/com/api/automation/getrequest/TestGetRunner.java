package com.api.automation.getrequest;

import com.intuit.karate.junit5.Karate;
import com.intuit.karate.junit5.Karate.Test;

class TestGetRunner {
    @Test
    public void  runTest(){
        Karate.run("getRequest").relativeTo(getClass());

    }
}
