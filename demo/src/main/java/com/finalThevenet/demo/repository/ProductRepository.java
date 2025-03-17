package com.finalThevenet.demo.repository;


import com.finalThevenet.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository <Product, Integer> {
    List<Product> findAll();
}
