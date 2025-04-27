package com.rohi.spring_security.repository;

import com.rohi.spring_security.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
