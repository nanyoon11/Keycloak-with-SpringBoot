package com.example.keycloak.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.keycloak.model.Customer;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

}
