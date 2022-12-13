package com.javasession.hibernate;

import com.javasession.hibernate.repository.OrderRepository;
import com.javasession.hibernate.repository.ProductRepository;
import com.javasession.hibernate.repository.SellerRepository;
import com.javasession.hibernate.repository.UserRepository;
import com.javasession.hibernate.service.OrderService;
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
	private OrderService orderService;
	@Autowired
	private SellerRepository sellerRepository;

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
//		Users u1 = new Users();
//		Users u2 = new Users();
//		u1.setName("Jim Halpert");
//		u2.setName("Pam Beasely");
//		userRepository.save(u1);
//		userRepository.save(u2);


//		Orders o1 = new Orders();
//		o1.setName("Order 1 For Jim");
//		o1.setUser(u1);
//		Orders o2 = new Orders();
//		o2.setName("Order 2 For Jim");
//		o2.setUser(u1);
//		Orders o3 = new Orders();
//		o3.setName("Order 1 For Pam");
//		o3.setUser(u2);
//		Orders o4 = new Orders();
//		o4.setName("Order 2 For Pam");
//		o4.setUser(u2);
//		Orders o5 = new Orders();
//		o5.setName("Order For Michael");
//		o5.setUser(u2);
//
//		orderRepository.save(o1);
//		orderRepository.save(o2);
//		orderRepository.save(o3);
//		orderRepository.save(o4);
//		orderRepository.save(o5);
//
//		Seller s1 = new Seller();
//		s1.setName("Appario Digital");
//
//		sellerRepository.save(s1);
//
//		Product p1 = new Product();
//		p1.setName("Iphone 13");
//		p1.setSeller(s1);
//		Product p2 = new Product();
//		p2.setName("Washing Machine");
//		p2.setSeller(s1);
//		Product p3 = new Product();
//		p3.setName("Play Station V");
//		p3.setSeller(s1);
//		Product p4 = new Product();
//		p4.setName("Puma Running Shoes");
//		p4.setSeller(s1);
//		Product p5 = new Product();
//		p5.setName("USPA Tshirt");
//		p5.setSeller(s1);
//
//		productRepository.save(p1);
//		productRepository.save(p2);
//		productRepository.save(p3);
//		productRepository.save(p4);
//		productRepository.save(p5);

		userService.getAllUsers();

	}
}
