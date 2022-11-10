package com.example.hotelmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotelmanagementsystem.entity.Customer;
import com.example.hotelmanagementsystem.entity.Hotel;
import com.example.hotelmanagementsystem.repositary.CustomerRepositary;
import com.example.hotelmanagementsystem.repositary.HotelRepositary;
import com.example.hotelmanagementsystem.repositary.RoomRepositray;


@Service
public class CustomerSerivce {

	@Autowired
	private CustomerRepositary customerRepo;
	
	@Autowired
	private HotelRepositary HotelRepo;
	
	@Autowired
	private RoomRepositray orderRepo;
	
	
	public Customer saveCustomer(Customer customerEntity) {
		// TODO Auto-generated method stub
		return customerRepo.save(customerEntity);
	}

	public List<Hotel> searchRooms(String searchString) {
		return HotelRepo.findByCategory(searchString);
	}

	public RoomRepositray getOrderRepo() {
		return orderRepo;
	}

	public void setOrderRepo(RoomRepositray orderRepo) {
		this.orderRepo = orderRepo;
	}
}
