package com.samhitha.mywebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.samhitha.entity.Employee;
import com.samhitha.service.EmployeeService;
import com.samhitha.service.EmployeeServiceImpl;

@SpringBootApplication
public class OracleCrudApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(OracleCrudApplication.class, args);
		EmployeeService service= ac.getBean(EmployeeServiceImpl.class);
		Employee emp=new Employee();
		//emp.setEmpid(empid);
		emp.setEmpName("Samhitha");
		emp.setEmpSal(80000.90);
		boolean status=service.saveEmployee(emp);
		if(status)
			System.out.print("data inserted");
		else
			System.out.println("data not inserted");
	}

}
