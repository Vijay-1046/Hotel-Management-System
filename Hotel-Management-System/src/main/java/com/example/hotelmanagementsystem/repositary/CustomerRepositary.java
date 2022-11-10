package com.example.hotelmanagementsystem.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hotelmanagementsystem.entity.Customer;

public interface CustomerRepositary extends JpaRepository<Customer, Integer> {

}
