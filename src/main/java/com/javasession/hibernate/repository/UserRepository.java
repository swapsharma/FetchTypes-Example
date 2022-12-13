package com.javasession.hibernate.repository;

import com.javasession.hibernate.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Long> {
    List<Users> findAll();
}
