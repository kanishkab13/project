package com.cg.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dto.PatientDTO;
import com.cg.entity.Patient;
import com.cg.service.IPatientService;

@RequestMapping("/api")
@RestController
public class PatientController {
	@Autowired
	IPatientService patientservice;

	@GetMapping("/patients")
	public List<Patient> getPatients()
	{
		return patientservice.findAll();
	}
	
	@GetMapping("/patients/{id}")
	public Optional<Patient> findPatientById(@PathVariable int id){
		return patientservice.findPatientById(id);	
	}
	
	@GetMapping("/patients/mypatient")
	public Optional<Patient> getPatientById(@RequestParam int id){
		return patientservice.findPatientById(id);
	}
	
	@PostMapping("/patients")
	public PatientDTO createPatient(@Validated @RequestBody PatientDTO patientdto) {
		Patient patient=patientdto.toEntity();
		Patient createdPatient=patientservice.CreatePatient(patient);
		return PatientDTO.fromEntity(createdPatient);
	}
	
	@DeleteMapping("/patients/{id}")
	public String deletePatientById(@PathVariable int id) {
		String r=patientservice.DeletePatientbyId(id);
		return r;
	}
	
	@PutMapping("/patients")
	public Patient UpdatePatient(@RequestBody Patient p) {
		return patientservice.UpdateData(p);
	}
}