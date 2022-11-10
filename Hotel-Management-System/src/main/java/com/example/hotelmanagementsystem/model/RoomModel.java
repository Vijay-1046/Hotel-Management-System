package com.example.hotelmanagementsystem.model;

public class RoomModel {

	private int customerId;
	private String roomtypes;
	private String roomNumber;
	private int quantity;
	private int roomid;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getroomtypes() {
		return roomtypes;
	}
	public void setroomtypes(String roomtypes) {
		this.roomtypes = roomtypes;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	
	
}
