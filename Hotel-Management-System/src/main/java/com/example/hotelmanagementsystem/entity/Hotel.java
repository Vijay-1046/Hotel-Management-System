package com.example.hotelmanagementsystem.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Hotel")
public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	
	@Column(name = "hotel_name")
	private String hotelName;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "room_capacity")
	private int roomapacity;
	
	@Column(name = "rent")
	private int rent;
	
	@Column(name = "neededRooms")
	private String neededRooms;
	
	@Column(name = "roomTypes")
	private String roomTypes;
	
	@Column(name = "category")
	private String category;
	

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@OneToMany
	private List<Room> rooms;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRoomapacity() {
		return roomapacity;
	}

	public void setRoomapacity(int roomapacity) {
		this.roomapacity = roomapacity;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public String getNeededRooms() {
		return neededRooms;
	}

	public void setNeededRooms(String neededRooms) {
		this.neededRooms = neededRooms;
	}

	public String getRoomtypes() {
		return roomTypes;
	}

	public void setRoomtypes(String roomtypes) {
		this.roomTypes = roomtypes;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	
	

}