package com.cg.service;

import java.util.List;
import java.util.Optional;

import com.cg.entity.Patient;

public interface IPatientService {
    List<Patient> findAll();
    public Optional<Patient> findPatientById(int id);
    public Patient CreatePatient(Patient p);
    public String DeletePatientbyId(int id);
    public Patient UpdateData(Patient p);

}