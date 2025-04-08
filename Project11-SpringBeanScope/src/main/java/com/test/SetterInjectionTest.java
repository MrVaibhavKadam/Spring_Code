package com.test;

import com.service.Printer;
import com.service.WishMessageGenerator;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SetterInjectionTest {
    public static void main(String[] args) {

        DefaultListableBeanFactory factory =  new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("applicationContext.xml");

        //get target bean class reference
       /* WishMessageGenerator messageGenerator1 = factory.getBean("wmg", WishMessageGenerator.class);
        WishMessageGenerator messageGenerator2 = factory.getBean("wmg", WishMessageGenerator.class);

        System.out.println(messageGenerator1.hashCode()+ " "+ messageGenerator2.hashCode());
        System.out.println("messageGenerator1 == messageGenerator2 ? "+ (messageGenerator1 == messageGenerator2));

        System.out.println("=========================================================================================");

        WishMessageGenerator messageGenerator3 = factory.getBean("wmg1", WishMessageGenerator.class);
        WishMessageGenerator messageGenerator4 = factory.getBean("wmg1", WishMessageGenerator.class);

        System.out.println(messageGenerator3.hashCode()+ " "+ messageGenerator4.hashCode());
        System.out.println("messageGenerator3 == messageGenerator4 ? "+ (messageGenerator3 == messageGenerator4));
*/



       /* System.out.println("=========================================================================================");

        Printer p1 = factory.getBean("p1", Printer.class);
        Printer p2 = factory.getBean("p1", Printer.class);

        System.out.println(p1.hashCode()+" "+ p2.hashCode());

        System.out.println("----------------------------------------------------------------------------------");

        Printer p3 = factory.getBean("p2", Printer.class);
        Printer p4 = factory.getBean("p2", Printer.class);
        System.out.println(p3.hashCode()+" "+ p4.hashCode());*/

        System.out.println("==================================================================================");

//        we are using scope= "prototype" hence every time we call factory.bean(). method we get new object
        WishMessageGenerator messageGenerator1 = factory.getBean("wmg", WishMessageGenerator.class);
        WishMessageGenerator messageGenerator2 = factory.getBean("wmg", WishMessageGenerator.class);

        System.out.println(messageGenerator1.hashCode()+ " "+ messageGenerator2.hashCode());
        System.out.println("messageGenerator1 == messageGenerator2 ? "+ (messageGenerator1 == messageGenerator2));

    }
}
