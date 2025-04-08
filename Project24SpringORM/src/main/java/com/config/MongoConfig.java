package com.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

public class MongoConfig extends AbstractMongoClientConfiguration {
    @Override
    protected String getDatabaseName() {
        return "springormtest";
    }

    @Bean
    public MongoTemplate mongoTemplate(){
        return new MongoTemplate(MongoClients.create("mongodb://localhost:27017"), getDatabaseName());
    }
}
