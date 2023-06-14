package com.example.jforce.demo.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="jobs_history")
public class JobsHistory {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long emp_id;

	//-----------------------------------
	
	@ManyToOne
    @JoinColumn(name = "job_id")
	private Jobs job;
	
	@ManyToOne
    @JoinColumn(name = "department_id")
	private Departments departments; //diğer tablolardan foreign key tanımlamak için  
	
	//-----------------------------------
	
	@Column(name = "start_date")
	private String start_date;
	
	@Column(name = "end_date")
	private String end_date;
	
	@Column(name = "end_reason_r")
	private String end_reason_r;

	public Long getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Long emp_id) {
		this.emp_id = emp_id;
	}

	public Jobs getJob() {
		return job;
	}

	public void setJob(Jobs job) {
		this.job = job;
	}

	public Departments getDepartments() {
		return departments;
	}

	public void setDepartments(Departments departments) {
		this.departments = departments;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getEnd_reason_r() {
		return end_reason_r;
	}

	public void setEnd_reason_r(String end_reason_r) {
		this.end_reason_r = end_reason_r;
	}
	
}
