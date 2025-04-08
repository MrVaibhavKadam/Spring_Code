package com.test;

import com.config.MongoConfig;
import com.config.PostgreSqlConfig;
import com.dao.ProductDao;
import com.dao.UserDao;
import com.model.Product;
import com.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PostgreSqlConfig.class, MongoConfig.class);

        UserDao userDao = ctx.getBean(UserDao.class);
        ProductDao productDao = ctx.getBean(ProductDao.class);

        User user = new User();
        user.setName("Vaibhav");
        user.setEmail("vaaibhav@mail.com");

        User user1 = new User();
        user1.setName("Rohit");
        user1.setEmail("rohit@mail.com");

        userDao.saveUser(user);
        userDao.saveUser(user1);

        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(85975.00);

        Product product1 = new Product();
        product1.setName("Mobile");
        product1.setPrice(85975.00);

        productDao.saveProduct(product);
        productDao.saveProduct(product1);

        ctx.close();

    }
}
