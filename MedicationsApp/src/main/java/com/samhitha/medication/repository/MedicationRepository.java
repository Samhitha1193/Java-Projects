package com.samhitha.medication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.samhitha.medication.entity.MEDICATION_DETAILS;

@Repository
public interface MedicationRepository extends CrudRepository<MEDICATION_DETAILS, Long> {

}
