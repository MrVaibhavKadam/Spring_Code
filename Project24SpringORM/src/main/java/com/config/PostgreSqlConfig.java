package com.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.DriverManager;
import java.util.Properties;

@Configuration
@ComponentScan("com")
@EnableTransactionManagement
public class PostgreSqlConfig {

    @Bean
    public DataSource postgresDataSource(){

        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/springorm");
        dataSource.setUsername("postgres");
        dataSource.setPassword("1234");

        return dataSource;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory(){

        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setDataSource(postgresDataSource());

        //Hibernate Properties
        Properties hProperties = new Properties();

        hProperties.setProperty("hibernate.dialect","org.hibernate.dialect.PostgreSQLDialect");
        hProperties.setProperty("hibernate.show_sql", "true");
        hProperties.setProperty("hibernate.hbm2ddl.auto", "update");

        factoryBean.setHibernateProperties(hProperties);
        factoryBean.setPackagesToScan("com");

        return factoryBean;
    }

    @Bean
    public HibernateTransactionManager transactionManager(){
        return new HibernateTransactionManager(sessionFactory().getObject());
    }


}
