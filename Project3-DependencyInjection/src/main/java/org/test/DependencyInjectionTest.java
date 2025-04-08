package org.test;

import org.example.Person;
import org.example.Person1;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class DependencyInjectionTest {

    public static void main(String[] args) {
        //create IOC container

        ClassPathResource res = new ClassPathResource("applicationContext.xml");

        XmlBeanFactory factory = new XmlBeanFactory(res);

        Person person = (Person) factory.getBean("per");

        System.out.println(person);//Person{pid=101, pname='Vaibhav', padd='null', income=0.0}
        //We injected only two properties and remaining two properties are having default values.
        System.out.println("================================================================");

        Person1 person1 = (Person1) factory.getBean("per1");
        System.out.println(person1);

    }

}
