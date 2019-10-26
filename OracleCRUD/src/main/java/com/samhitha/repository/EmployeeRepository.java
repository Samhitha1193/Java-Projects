
package com.samhitha.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.samhitha.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Serializable> {
	
	
	
	

}
