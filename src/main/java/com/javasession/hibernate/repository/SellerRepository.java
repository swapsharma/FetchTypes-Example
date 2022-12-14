package com.javasession.hibernate.repository;

import com.javasession.hibernate.entity.Seller;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    List<Seller> findAll();

    @EntityGraph(attributePaths = {"products"})
    List<Seller> findAllByUsingEntityGraph();
}
