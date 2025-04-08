package org.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Random;

@Component("fpkt")
public final class Flipkart {

    @Autowired
    @Qualifier("blueDart")//Field Level
    private  Courier courier;

    public Flipkart( ){
        System.out.println("Flipkart: 0-Param constructor.!");
    }

   /* public void setCourier(Courier courier){
        System.out.println("Flipkart.setCourier:");
        this.courier = courier;
    }*/

    //Business Logic

    public String shopping(String[] items, float[] prices){
        float billAmount = 0.0f;

        for (float p: prices)
            billAmount += p ;
        //generate order Id
        int oId = new Random().nextInt(1000);

        //use courier
        String msg = courier.deliver(oId);

        return Arrays.toString(items)+" with prices "+Arrays.toString(prices)+" having billamount "+billAmount + " :: "+ msg;
    }

}
