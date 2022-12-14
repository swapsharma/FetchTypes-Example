package com.javasession.hibernate.service;

import com.javasession.hibernate.entity.Seller;
import com.javasession.hibernate.entity.Users;
import com.javasession.hibernate.repository.SellerRepository;
import com.javasession.hibernate.repository.UserRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@Slf4j
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    public void getAllSellers() {
        log.info(">>>>>>>>>> An example of Easy Loading <<<<<<<<<<<<<<");
        List<Seller> sellerList = sellerRepository.findAllByUsingEntityGraph();
        sellerList.stream().forEach(seller -> {
            log.info("Seller : {}", seller.getName());
            seller.getProducts().stream().forEach(product -> {
                log.info("ProductId : {}", product.getProductId());
                log.info("ProductId Name : {}", product.getName());
            });
        });
    }
}
