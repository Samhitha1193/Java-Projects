package com.samhitha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samhitha.entity.Employee;
import com.samhitha.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	@Override
	public boolean saveEmployee(Employee e) {
		// TODO Auto-generated method stub
		Employee emp=repository.save(e);
		return (emp!=null)?true:false;
	}

}
