package org.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Random;

@Component("fpkt")
@PropertySource("info.properties")
public final class Flipkart {

    @Autowired
    //@Qualifier("${courier.id}") we can not use it UnsatisfiedDependencyException gives this error.
    //@Qualifier("@Value("${courier.id}")") // We can add value to other properties of target class using properties file and @Value annotations
    //But we can not change the dependent class i.e value of dependent class at runtime.
    @Qualifier("dt")
    private  Courier courier;

    @Value("${fpt.info.url}")
    private String url;

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

        return Arrays.toString(items)+" with prices "+Arrays.toString(prices)+" having billamount "+billAmount + " :: "+ msg+"========>"+url;
    }

}
