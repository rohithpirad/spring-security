package com.rohi.spring_security.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    private Long id;

    @Column(nullable = false, name = "street_name")
    private String streetName;

    @Column(nullable = false, name = "pin_code")
    private String pinCode;

}
