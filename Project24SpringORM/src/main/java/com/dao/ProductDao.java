package com.dao;

import com.model.Product;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;


import java.util.List;

@Repository
public class ProductDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void saveProduct(Product product){
        mongoTemplate.save(product);
    }

    public Product getProductbyId(String id){
        return mongoTemplate.findById(id, Product.class);
    }

    public List<Product> getAllProducts() {
        return mongoTemplate.findAll(Product.class);
    }

    public void updateProduct(Product product) {
        mongoTemplate.save(product);
    }

    public void deleteProduct(String id){
        Query query = new Query(Criteria.where("id").is((id)));
        mongoTemplate.remove(query, Product.class);
    }

}
