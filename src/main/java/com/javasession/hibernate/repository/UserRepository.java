package com.javasession.hibernate.repository;

import com.javasession.hibernate.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Long> {
    List<Users> findAll();

    @Query("SELECT u FROM Users u LEFT JOIN FETCH u.orders")
    List<Users> findWithoutNPlusOne();
}
