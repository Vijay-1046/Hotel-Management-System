package com.example.hotelmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotelmanagementsystem.entity.Customer;
import com.example.hotelmanagementsystem.entity.Hotel;
import com.example.hotelmanagementsystem.service.CustomerSerivce;



@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerSerivce customerService;
	
	@PostMapping("/registerCustomer")
	public Customer saveCustomer(@RequestBody Customer customerEntity) {
		return customerService.saveCustomer(customerEntity);
	}
	
	@GetMapping("/searchRooms")
	public List<Hotel> searchRooms(@RequestParam String searchString ){
		return customerService.searchRooms(searchString);
		
	}
}
