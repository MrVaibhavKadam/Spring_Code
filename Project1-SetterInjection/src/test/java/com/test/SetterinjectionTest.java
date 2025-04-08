package com.test;


import com.service.WishMessageGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class SetterinjectionTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void testSpringContestLoades(){

        assertNotNull("Spring Application should not be null.",context);

    }

    @Test
    public void testBeanCreation(){
        WishMessageGenerator messageGenerator = (WishMessageGenerator) context.getBean("wmg");
        assertNotNull("Bean should be created", messageGenerator);
    }



}
