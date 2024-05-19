package com.example.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Products;

public interface ProductRepository extends JpaRepository<Products,Integer>{

}
