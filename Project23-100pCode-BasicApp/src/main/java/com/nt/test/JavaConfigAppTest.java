package com.nt.test;

import com.nt.beans.WishMessageGenerator;
import com.nt.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigAppTest {
    public static void main(String[] args) {
        //Create IoC Container
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        //get target class obj
        WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);

        //invoke B.Method
        System.out.println(generator.generate("Angad"));

        //close container
        ctx.close();

    }
}
