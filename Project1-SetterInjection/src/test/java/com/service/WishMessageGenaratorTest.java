package com.service;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class WishMessageGenaratorTest {

    private WishMessageGenerator wishMessageGenerator;

    @Before
    public void setUp(){
        //first create instance of the class WishMessageGenerator
        wishMessageGenerator = new WishMessageGenerator();

        //set fix date for testing
        Date date = new Date();
        date.setHours(10);// Simulate Morning Time (10 AM)
        wishMessageGenerator.setDate(date);

    }

    @Test
    public void morningMsgGeneratorTest(){
        String user = "Vaibhav";

        String result = wishMessageGenerator.generateWishMessage(user);

        assertEquals("GMVaibhav",result);

    }

    @Test
    public void afternoonMsgGeneratorTest(){

        Date date = new Date();
        date.setHours(14);
        wishMessageGenerator.setDate(date);

        String user = "Vaibhav";
        String result = wishMessageGenerator.generateWishMessage(user);

        assertEquals("GAVaibhav", result);

    }

    @Test
    public void eveningMsgGeneratorTest(){
        Date date = new Date();
        date.setHours(18);
        wishMessageGenerator.setDate(date);

        String result = wishMessageGenerator.generateWishMessage("Vaibhav");

        assertEquals("GEVaibhav", result);
    }

    @Test
    public void nightMsgGeneratorTest(){

        Date date = new Date();
        date.setHours(20);
        wishMessageGenerator.setDate(date);

        String result = wishMessageGenerator.generateWishMessage("Vaibhav");

        assertEquals("GNVaibhav", result);

    }

}
