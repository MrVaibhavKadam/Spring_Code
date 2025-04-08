package org.com.beans;

import java.util.Date;

public class VoterVerifier {

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
    //Init life cycle method/custom init method.
    public void myInit(){
        System.out.println("VoterVerifier.myInit");

        verificationDate = new Date();//initializing bean property that is not participating in injection.

        if (name.equalsIgnoreCase("null") || age <= 0)
            throw new IllegalArgumentException("Invalid inputs are given for name and age properties.");

    }

    //destory life cycle method/ custom destory method.
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
