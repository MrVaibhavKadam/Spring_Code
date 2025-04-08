package com.test;

import com.beans.VoterVerifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanLifeCycleAnnotationApprochTest {
    public static void main(String[] args) {
        //IOC Container

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContest.xml");

        //get Spring bean object
        VoterVerifier voter = ctx.getBean("voter", VoterVerifier.class);

        //calling b.method

        try{
            System.out.println(voter.checkVotingEligibility());
        } catch (Exception e) {

            e.printStackTrace();
        }

        ctx.close();//close container

    }
}
