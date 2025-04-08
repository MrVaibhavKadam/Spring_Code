package org.factory;

import org.component.BlueDart;
import org.component.Courier;
import org.component.DTDC;
import org.component.Flipkart;

public class FlipkartFactory {

    public static Flipkart getInstance(String courierType){
        //create dependent class object
        Courier courier =null;
        if (courierType.equalsIgnoreCase("dtdc"))
            courier = new DTDC();
        else if (courierType.equalsIgnoreCase("bluedart"))
            courier = new BlueDart();
        else
            throw new IllegalArgumentException("Invalid Courier type");

        //create target class object
        Flipkart fk = new Flipkart();

        //assign dependent class obj to target class
        fk.setCourier(courier);
        return fk;
    }

}
