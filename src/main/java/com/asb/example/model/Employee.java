package com.asb.example.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Table(name="employeedetails")
public class Employee implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="Id")
	private Long id;
	
	@Column(name="EmployeeName")
	private String employeeName;
	
	@Column(name="EmployeeCode")
	private String employeeCode;
	
	@Column(name="Designation")
	private String designation;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addressid",referencedColumnName = "id")
	
	private Address address;
}
