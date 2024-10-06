package com.foodOrder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodOrder.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
