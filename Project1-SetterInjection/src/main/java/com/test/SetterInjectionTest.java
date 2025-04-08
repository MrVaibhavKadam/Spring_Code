package com.test;

import com.service.WishMessageGenerator;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class SetterInjectionTest {
    public static void main(String[] args) {

       // FileSystemResource res = new FileSystemResource("src/main/resources/applicationContext.xml");
        ClassPathResource res = new ClassPathResource("applicationContext.xml");
        XmlBeanFactory factory = new XmlBeanFactory(res);

        Object obj = factory.getBean("wmg");

        WishMessageGenerator messageGenerator = (WishMessageGenerator) obj;

        String result = messageGenerator.generateWishMessage("Vaibhav");

        System.out.println(result);


    }
}
