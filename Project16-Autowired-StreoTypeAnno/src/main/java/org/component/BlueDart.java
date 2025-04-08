package org.component;

import org.springframework.stereotype.Component;

@Component("blueDart")
public final class BlueDart implements  Courier{

    public BlueDart(){
        System.out.println("BlueDart:0-Param constructor");
    }

    @Override
    public String deliver(int oId) {
        return "Delivering "+ oId+ " By BlueDart Product.!";
    }
}
