package com.example.jforce.demo.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employees {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empId;

	@Column(name = "emp_pp")
	private String emp_pp;

	@Column(name = "emp_name")
	private String empName; //empName gibi cC tanımla hepsini. 

	@Column(name = "emp_surname")
	private String empSurname;

	@Column(name = "emp_identity")
	private Integer empIdentity;

	@Column(name = "emp_gender")
	private String empGender;

	@Column(name = "emp_birth")
	private String empBirth;

	@Column(name = "emp_marital")
	private String empMarital;

	@Column(name = "emp_graduation")
	private String empGraduation;

	@Column(name = "emp_phone_num")
	private Integer empPhoneNum;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmp_pp() {
		return emp_pp;
	}

	public void setEmp_pp(String emp_pp) {
		this.emp_pp = emp_pp;
	}

	public String getEmp_name() {
		return empName;
	}

	public void setEmp_name(String emp_name) {
		this.empName = emp_name;
	}

	public String getEmp_surname() {
		return empSurname;
	}

	public void setEmp_surname(String emp_surname) {
		this.empSurname = emp_surname;
	}

	public Integer getEmp_identity() {
		return empIdentity;
	}

	public void setEmp_identity(Integer emp_identity) {
		this.empIdentity = emp_identity;
	}

	public String getEmp_gender() {
		return empGender;
	}

	public void setEmp_gender(String emp_gender) {
		this.empGender = emp_gender;
	}

	public String getEmp_birth() {
		return empBirth;
	}

	public void setEmp_birth(String emp_birth) {
		this.empBirth = emp_birth;
	}

	public String getEmp_marital() {
		return empMarital;
	}

	public void setEmp_marital(String emp_marital) {
		this.empMarital = emp_marital;
	}

	public String getEmp_graduation() {
		return empGraduation;
	}

	public void setEmp_graduation(String emp_graduation) {
		this.empGraduation = emp_graduation;
	}

	public Integer getEmp_phone_num() {
		return empPhoneNum;
	}

	public void setEmp_phone_num(Integer emp_phone_num) {
		this.empPhoneNum = emp_phone_num;
	}

	
}
