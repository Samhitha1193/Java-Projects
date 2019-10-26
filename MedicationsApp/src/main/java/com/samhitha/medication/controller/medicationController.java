package com.samhitha.medication.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samhitha.medication.entity.MEDICATION_DETAILS;
import com.samhitha.medication.repository.MedicationRepository;

@RestController
//@RequestMapping("/api/medications")
public class medicationController {
	
	@Autowired
	MedicationRepository medrepo;
	
	 @GetMapping(path="/abc")
	    public Iterable findAll() {
		 System.out.println("fetching records from database....");
	        return medrepo.findAll();
	    }
	 
	 @PostMapping
	 public MEDICATION_DETAILS create(@Valid @RequestBody MEDICATION_DETAILS med) {
		 System.out.println("inserting into database....");

	        return medrepo.save(med);
	    }
	 
	 
	 @PutMapping("/{id}")
	 public MEDICATION_DETAILS updateMed(@RequestBody MEDICATION_DETAILS med, @PathVariable Long id) {
	    	
		 System.out.println("updating record in database...."+id);
		 MEDICATION_DETAILS med1=medrepo.findById(id).get();
		 
		String desc=med.getDESCRIPTION();
	        med1.setDESCRIPTION(desc);
	         
	        return medrepo.save(med1);
	    }
	 
	 @DeleteMapping("/{id}")
	    public void delete(@PathVariable Long id) {
	        medrepo.findById(id);
	          			 System.out.println("deleting from database....");

	        medrepo.deleteById(id);
	    }

}

