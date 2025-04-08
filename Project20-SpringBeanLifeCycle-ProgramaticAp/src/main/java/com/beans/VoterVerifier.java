package com.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.Date;

public class VoterVerifier implements InitializingBean, DisposableBean {

    private String name;
    private float age;
    private Date verificationDate;

    public void setName(String name) {
        System.out.println("VoterVerifier.setName");
        this.name = name;
    }

    public void setAge(float age) {
        System.out.println("VoterVerifier.setAge");
        this.age = age;
    }

    public VoterVerifier() {
        System.out.println("VoterVerifier.VoterVerifier:: 0-Param Constructor..!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("VoterVerifier.destory(Disposable interface)");

        //nullyfying the properties
        name = null;
        age = 0;
        verificationDate = null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("VoterVerifier.afterPropertiesSet(InitializingBean interface)");

        verificationDate = new Date();//initializing bean property that is not participating in injection.

        if (name.equalsIgnoreCase("null") || age <= 0)
            throw new IllegalArgumentException("Invalid inputs are given for name and age properties.");

    }


    //B. Method

    public String checkVotingEligibility(){
        if(age < 18)
            return  "mr/mrs/miss "+ name + " u r eligible for not voting wait "+(18 - age)+ "years.";
        else
            return "mr/mrs/miss "+ name + " u r eligible for voting..! ";
    }


}
