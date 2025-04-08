package org.test;

import org.component.Flipkart;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class StrategyDPTest {
    public static void main(String[] args) {
        //Create IOC Container
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("applicationContext.xml");

        //get target class object
        Flipkart fpkt = factory.getBean("fk", Flipkart.class);

        //Invoke the business method
        String result = fpkt.shopping(new String[]{"Shirt", "Jeans","Jogger"}, new float[]{1000.0f,3000.0f,5000.0f});
        System.out.println("Result: " + result);

    }
}
