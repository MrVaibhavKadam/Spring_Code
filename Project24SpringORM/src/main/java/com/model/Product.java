package com.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collation = "products")
@Data
public class Product {

    @Id
    private String id;
    private String name;
    private double price;

}
