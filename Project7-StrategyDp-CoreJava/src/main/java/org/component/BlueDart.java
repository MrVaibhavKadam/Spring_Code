package org.component;

public final class BlueDart implements  Courier{

    public BlueDart(){
        System.out.println("BlueDart:0-Param constructor");
    }

    @Override
    public String deliver(int oId) {
        return "Delivering"+ oId+ "Product.!";
    }
}
