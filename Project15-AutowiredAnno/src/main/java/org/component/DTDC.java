package org.component;

public final class DTDC implements  Courier{

    public DTDC(){
        System.out.println("DTDC:0-Param constructor");
    }

    @Override
    public String deliver(int oId) {
        return "Delivering"+ oId+ "Product.!";
    }
}
