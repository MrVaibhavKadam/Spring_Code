package org.test;

import org.service.WishMessageGenerator;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ConstructorInjectionTest {
    public static void main(String[] args) {

       // FileSystemResource res = new FileSystemResource("src/main/resources/applicationContext.xml");
        ClassPathResource res = new ClassPathResource("applicationContext.xml");
        XmlBeanFactory factory = new XmlBeanFactory(res);

       // Object obj = factory.getBean("wmg");

        //WishMessageGenerator messageGenerator = (WishMessageGenerator) obj;

        WishMessageGenerator generator = (WishMessageGenerator)factory.getBean("wmg");

        String result = generator.generateWishMessage("Vaibhav");

        System.out.println("Result :"+result);


    }
}
