package org.factory;

import org.component.Courier;
import org.component.Flipkart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class FlipkartFactory {
    //One time logic we can write in static block or Constructor but we are not using the This class object hence dont write in constructor
    private static Properties props;
    static {
        try {
            //Locate properties file
           // InputStream is = new FileInputStream("input.properties");
            InputStream is = FlipkartFactory.class.getClassLoader().getResourceAsStream("input.properties");

            if (is == null) {
                throw new FileNotFoundException("File not found in classpath: input.properties");
            }


            //Load properties file content into java.util.Properties class object
            props = new Properties();
            props.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static Flipkart getInstance() {
        try {
            //get dependant class name from properties file.
            String courierClassname = props.getProperty("courier.type");

            //Load dependant class
            Class c = Class.forName(courierClassname);
            //Courier courier = (Courier)c.newInstance(); //deprecated from java9
            Constructor cons[] = c.getConstructors();
            Courier courier = (Courier) cons[0].newInstance();
            //create target class object
            Flipkart fk = new Flipkart();

            //assign dependent class obj to target class
            fk.setCourier(courier);
            return fk;
        } catch (ClassNotFoundException cnf) {
            cnf.printStackTrace();
            return  null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }

}
