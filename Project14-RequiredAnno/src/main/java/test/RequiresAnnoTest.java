package test;

import org.Robot;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiresAnnoTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Robot robo = ctx.getBean("robo", Robot.class);

        System.out.println( robo);
    }
}
