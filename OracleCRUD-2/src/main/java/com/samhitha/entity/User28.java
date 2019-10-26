package com.samhitha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	
	@Entity
	@Table(name = "USER_TABLE")
	public class User28 {
	    public User28() {
			super();
		}

		public User28(Integer id, String name, Integer salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getSalary() {
			return salary;
		}

		public void setSalary(Integer salary) {
			this.salary = salary;
		}

		@Column(name = "ID")
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;
	  
	    @Column(name = "USER_NAME", nullable = true, length = 255)
	    private String name;
	  
	    @Column(name = "USER_SALARY", nullable = true, length = 10)
	    private Integer salary;
	  
	    
	    //constructor, setters and getters omitted for brevity
	}


