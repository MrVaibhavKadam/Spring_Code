package org.example;

public class Person {
    //Spring bean properties
    private int pid;
    private String pname;
    private  String padd;
    private float income;

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPadd(String padd) {
        this.padd = padd;
    }

    public void setIncome(float income) {
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
