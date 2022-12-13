package com.javasession.hibernate.service;

import com.javasession.hibernate.entity.Orders;
import com.javasession.hibernate.entity.Users;
import com.javasession.hibernate.repository.UserRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void getAllUsers() {
        log.info(">>>>>>>>>> An example of Lazy Loading <<<<<<<<<<<<<<");
        List<Users> userList = userRepository.findAll();

        userList.stream().forEach(user -> {
            log.info("User : {}", user.getName());
//            user.getOrdersList().stream().forEach(order -> {
//                log.info("OrderId : {}", order.getOrderId());
//                log.info("Order Name : {}", order.getName());
//            });
        });
    }
}
