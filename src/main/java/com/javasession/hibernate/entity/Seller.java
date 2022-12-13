package com.javasession.hibernate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sellerId;

    @Column
    private String name;

    @OneToMany(mappedBy = "seller",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Product> productList;
}
