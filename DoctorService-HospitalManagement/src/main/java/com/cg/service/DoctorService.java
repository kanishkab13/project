package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Doctor;
import com.cg.repository.DoctorRepository;

@Service
public class DoctorService implements IDoctorService {
	@Autowired
	DoctorRepository doctorRepository;
	
	@Override
	public List<Doctor> findAll() {
		return doctorRepository.findAll();
	}
	public Optional<Doctor> findDoctorById(int id) {
		return doctorRepository.findById(id);
	}
	
	public Doctor createDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}
	
	public String deleteDoctorById(int id) {
		if (doctorRepository.existsById(id)) {
	        doctorRepository.deleteById(id);;
	         return "deleted";
	    } else {
	    	 return "id not found";
	    }			
	}
	
	public Doctor updateDoctorData(Doctor doctor) {	
		return doctorRepository.save(doctor);
	}
	@Override
	public int getCountByDoctorName(String dname) {
		return doctorRepository.getCountByDoctorName(dname);
	}
}


