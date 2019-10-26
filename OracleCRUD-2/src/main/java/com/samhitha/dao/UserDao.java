package com.samhitha.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samhitha.entity.User28;
//import com.samhitha.mywebapp.Book;

//import com.samhitha.entity.User28.User;

@Repository
public interface UserDao extends JpaRepository<User28,Integer> {
	
	// Optional<User28> findById(Integer id);
	// Optional<User28> getAllUsers(User28 user);
}
