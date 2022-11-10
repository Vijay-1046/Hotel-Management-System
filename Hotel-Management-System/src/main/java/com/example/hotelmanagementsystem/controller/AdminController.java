package com.example.hotelmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotelmanagementsystem.entity.Hotel;
import com.example.hotelmanagementsystem.entity.User;
import com.example.hotelmanagementsystem.service.AdminSerive;



@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
    private  AdminSerive adminService;
	
	@PostMapping("/saveRoom")
	public Hotel saveRoom(@RequestBody Hotel hotel) {
		
	return adminService.saveRoom(hotel);
	}
	
	@DeleteMapping("/deletRoom")
	public void deleteRoom(@RequestParam int id) {
		
		adminService.deleteRoom(id);
		
		
	}
	
	@PostMapping("/saveStaff")
	public User saveStaff(@RequestBody User userEntity) {
		
		return adminService.saveStaff(userEntity);
		
	}
	
	@DeleteMapping("/deletStaff")
    public String deleteStaff(@RequestParam int id) {
		
		return adminService.deletStaff(id);
	
	}
}

