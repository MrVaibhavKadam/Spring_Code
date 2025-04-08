package org.example;

public class Person1 {
    //Spring bean properties
    private int pid;
    private String pname;
    private  String padd;
    private float income;

    public Person1(int pid, String pname, String padd, float income) {
        System.out.println("Person1: 4 - Param Constructor.");
        this.pid = pid;
        this.pname = pname;
        this.padd = padd;
        this.income = income;
    }

    //alt+shift+s,s
    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", padd='" + padd + '\'' +
                ", income=" + income +
                '}';
    }
}
