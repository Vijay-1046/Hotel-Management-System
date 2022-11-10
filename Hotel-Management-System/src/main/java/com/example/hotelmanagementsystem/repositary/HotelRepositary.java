package com.example.hotelmanagementsystem.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.hotelmanagementsystem.entity.Hotel;


public interface HotelRepositary extends JpaRepository<Hotel, Integer> {

	List<Hotel> findByCategory(String searchString);
	
	Hotel findByRoomTypesAndHotelName(String Roomtype, String hotelName);
	
	@Query(value="SELECT * FROM Hotel where hotel_name =?1",nativeQuery=true)
	Hotel getByHotelName(String hotelName);



}
