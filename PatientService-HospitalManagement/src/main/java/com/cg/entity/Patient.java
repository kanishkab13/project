package com.cg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Project_patient")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Patient_Id")
	private int pid;
	@Column(name="Patient_Name")
	@NotBlank(message = "The name must not be null and must contain at least one non-whitespace character")
	private String pname;
	@Column(name="Patient_Phone")
	private int phone;
	@Column(name="Patient_Address")
	private String address;
}