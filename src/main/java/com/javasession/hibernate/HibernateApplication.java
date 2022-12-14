package com.javasession.hibernate;

import com.javasession.hibernate.repository.OrderRepository;
import com.javasession.hibernate.repository.ProductRepository;
import com.javasession.hibernate.repository.SellerRepository;
import com.javasession.hibernate.repository.UserRepository;
import com.javasession.hibernate.service.SellerService;
import com.javasession.hibernate.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private UserService userService;

	@Autowired
	private SellerRepository sellerRepository;

	@Autowired
	private SellerService sellerService;

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {

		userService.getAllUsersUsingJoinFetch();
		sellerService.getAllSellers();


	}
}
