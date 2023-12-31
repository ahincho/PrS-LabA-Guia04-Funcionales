package com.unsa.proposed;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.Result;

public class MaxTestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MaxCheckerTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Result was successful? = " + result.wasSuccessful());
    }
}