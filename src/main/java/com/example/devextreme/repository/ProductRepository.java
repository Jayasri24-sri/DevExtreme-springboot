package com.example.devextreme.repository;
import com.example.devextreme.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String>
{

}

