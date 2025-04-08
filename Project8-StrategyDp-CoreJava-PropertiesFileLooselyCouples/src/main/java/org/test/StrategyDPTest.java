package org.test;

import org.component.Flipkart;
import org.factory.FlipkartFactory;

public class StrategyDPTest {
    public static void main(String[] args) {
        //get target class object having dependent class object
        Flipkart fk = FlipkartFactory.getInstance();

        String result = fk.shopping(new String[]{"Shirt", "Jeans","Jogger"}, new float[]{1000.0f,3000.0f,5000.0f});

        System.out.println("Result "+result);
    }
}
