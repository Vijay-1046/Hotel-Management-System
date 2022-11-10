package com.example.hotelmanagementsystem.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hotelmanagementsystem.entity.Room;


public interface RoomRepositray extends JpaRepository<Room, Integer> {
	
	List<Room> findAllByCustomerId(int custId);

}
