package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component("wmg")
public class WishMessageGenerator {

    @Autowired
    private LocalDateTime date;

    public WishMessageGenerator() {
        System.out.println("WishMessageGenerator.WishMessageGenerator");
    }

    //B.Method
    public String generate(String user){

        int hour = date.getHour();

        if (hour < 12)
            return "Good Morning: "+user;
        else if (hour <16)
            return "Good Afternoon: "+user;
        else if (hour<20)
            return "Good Evening: "+user;
        else
            return "Good Night: "+user;

    }


}
