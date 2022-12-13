package com.javasession.hibernate.repository;

import com.javasession.hibernate.entity.Product;
import com.javasession.hibernate.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAll();

}
