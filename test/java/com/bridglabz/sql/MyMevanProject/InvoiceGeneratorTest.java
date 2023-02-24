package com.bridglabz.sql.MyMevanProject;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class InvoiceGeneratorTest {
	InvoiceGenerator  invoiceGenerator = new InvoiceGenerator();
    @BeforeClass
    public static void printBeforeAllMsg() {
        System.out.println("-------Welcome to the Cab Invoice Generator Program-------");
    }
    @After
    public void PrintAfterEachTestCasePass(){
        System.out.println("passed");
    }
    @Test
    public void givenDistanceAndTime_shouldReturn_CalculateFare() {
        double distance = 2.0;
        double time = 5.0;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25.0, fare, 0.0);
    }
    @Test
    public void givenLessDistanceAndTime_shouldReturn_MinimumCalculateFare() {
        double distance = 0.1;
        double time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(5, fare, 0.0);
    }
}
