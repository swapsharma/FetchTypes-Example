package com.javasession.hibernate.service;

import com.javasession.hibernate.entity.Orders;
import com.javasession.hibernate.entity.Users;
import com.javasession.hibernate.repository.OrderRepository;
import com.javasession.hibernate.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void getAllComments() {
        log.info(">>>>>>>>>> An example of Lazy Loading <<<<<<<<<<<<<<");
        List<Orders> ordersList = orderRepository.findAll();
        ordersList.stream().forEach(order -> {
            log.info("Orders [{}] from User [{}]", order.getOrderId(), order.getUser().getName());
        });

//        System.out.println(">>>>>>>>>> An example of Lazy Loading <<<<<<<<<<<<<<");
//        System.out.println("User Id : "+ user.getUserId());
//        System.out.println("User Name : "+ user.getName());
//        System.out.println("User Order List Size : "+ user.getOrdersList().size());
    }
}
