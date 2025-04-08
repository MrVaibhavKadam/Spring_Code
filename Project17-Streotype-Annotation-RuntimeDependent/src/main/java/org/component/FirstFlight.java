package org.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("fFlight")
public class FirstFlight implements Courier {

    @Value("${fpt.info.url}")
    private String crUrl;

    public FirstFlight()  {
        System.out.println("FirstFlight:: 0-Param Constructor.");
    }


    @Override
    public String deliver(int oId) {
        return "Delivering "+ oId + " product using firstflight===>"+ crUrl;
    }
}
