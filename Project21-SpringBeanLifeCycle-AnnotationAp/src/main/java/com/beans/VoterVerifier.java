package com.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component("voter")
public class VoterVerifier {

    @Value("${vt.name}")
    private String name;

    @Value("${vt.age}")
    private float age;
    private Date verificationDate;


    public VoterVerifier() {
        System.out.println("VoterVerifier.VoterVerifier:: 0-Param Constructor..!");
    }

    @PostConstruct
    public void myInit(){
        System.out.println("VoterVerifier.myInit");

        verificationDate = new Date();//initializing bean property that is not participating in injection.

        if (name.equalsIgnoreCase("null") || age <= 0)
            throw new IllegalArgumentException("Invalid inputs are given for name and age properties.");

    }

    @PreDestroy
    public void myDestory(){
        System.out.println("VoterVerifier.myDestory");

        //nullyfying the properties
        name = null;
        age = 0;
        verificationDate = null;
    }

    //B. Method

    public String checkVotingEligibility(){
        if(age < 18)
            return  "mr/mrs/miss "+ name + " u r eligible for not voting wait "+(18 - age)+ "years.";
        else
            return "mr/mrs/miss "+ name + " u r eligible for voting..! ";
    }


}
