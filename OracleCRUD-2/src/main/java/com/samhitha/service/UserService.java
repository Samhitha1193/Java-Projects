package com.samhitha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samhitha.dao.UserDao;
import com.samhitha.entity.User28;

@Service
public class UserService {

	 @Autowired
     UserDao userDao;
 
     public List<User28> getAllUsers() {
         return this.userDao.findAll();
     }
 
     public User28 addUser(User28 user) {
         return this.userDao.save(user);
     }

	public Optional<User28> findById(Integer id) {
		return this.userDao.findById(id);
		// TODO Auto-generated method stub
		
		
		
	}

	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
		this.userDao.deleteById(id);
	}
     
     
}
