package com.example.jforce.demo.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobs_categories")
public class JobsCategories {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long job_c_id;

	@Column(name = "job_c_name")
	private String job_c_name;

	public Long getJobs_c_id() {
		return job_c_id;
	}

	public void setJobs_c_id(Long jobs_c_id) {
		this.job_c_id = jobs_c_id;
	}

	public String getJobs_c_name() {
		return job_c_name;
	}

	public void setJobs_c_name(String jobs_c_name) {
		this.job_c_name = jobs_c_name;
	}
	
}
