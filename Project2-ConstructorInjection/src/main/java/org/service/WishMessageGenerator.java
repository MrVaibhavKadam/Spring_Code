package org.service;

import java.util.Date;

public class WishMessageGenerator {

    private Date date;
//   To see which one is executed first and which is the final value constructor injection or Setter injection
    public void setDate(Date date) {
        System.out.println("WishMsgGenerator.setDate()");
        this.date = date;
    }

    public WishMessageGenerator(Date date){
        System.out.println("WishmessageGenerator: 1-param constructor");
        this.date = date;
    }

    public String generateWishMessage(String user) {

        System.out.println("WishMsgGenerator.generateWishMsg:" + date);
        //get current hour of the day
        int hour = date.getHours();

        if(hour < 12)
            return "GM" + user;
        else if(hour < 16)
            return "GA" + user;
        else if(hour < 20)
            return "GE" + user;
        else
            return "GN" +user;

    }
}
