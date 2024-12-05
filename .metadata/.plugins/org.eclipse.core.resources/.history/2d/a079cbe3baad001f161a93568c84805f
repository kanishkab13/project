package com.cg.dto;

import com.cg.entity.Doctor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDTO {
  private int did;
  private String dname;
  private String qualification;
  
  public static DoctorDTO fromEntity(Doctor doctor) {
	return new DoctorDTO(doctor.getDid(),doctor.getDname(),doctor.getQualification());	  
  }
  
  public Doctor toEntity() {
	  return new Doctor(this.did,this.dname,this.qualification);
  }
}
