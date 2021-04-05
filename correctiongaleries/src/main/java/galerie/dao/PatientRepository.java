package galerie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import galerie.entity.Patient;

// This will be AUTO IMPLEMENTED by Spring 

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}