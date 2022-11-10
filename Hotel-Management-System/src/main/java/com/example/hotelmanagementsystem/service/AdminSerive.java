package com.example.hotelmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotelmanagementsystem.entity.Hotel;
import com.example.hotelmanagementsystem.entity.User;
import com.example.hotelmanagementsystem.repositary.HotelRepositary;
import com.example.hotelmanagementsystem.repositary.UserRepositary;


	@Service
	public class AdminSerive {
		@Autowired
	    private HotelRepositary hotelRepositary;
		
		@Autowired
		private UserRepositary UserRepo;


		public Hotel saveHotel(Hotel HotelEntity) {
			return hotelRepositary.save(HotelEntity);
			
			// TODO Auto-generated method stub
			
		}


		public String deleteRoom(int id) {
			hotelRepositary.deleteById(id);
			return "Room deleted";
			// TODO Auto-generated method stub
			
		}


		public UserRepositary getUserRepo() {
			return UserRepo;
		}


		public void setUserRepo(UserRepositary userRepo) {
			UserRepo = userRepo;
		}


		public Hotel saveRoom(Hotel hotel) {
			// TODO Auto-generated method stub
			return null;
		}


		public User saveStaff(User userEntity) {
			// TODO Auto-generated method stub
			return null;
		}


		public String deletStaff(int id) {
			// TODO Auto-generated method stub
			return null;
		}
	}