package com.example.hotelmanagementsystem.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hotelmanagementsystem.entity.User;

public interface UserRepositary extends JpaRepository<User, Integer> {

}
