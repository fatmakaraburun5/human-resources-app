package com.example.jforce.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jforce.demo.modal.JobsCategories;

public interface JobsCategoriesRepository extends JpaRepository<JobsCategories, Long> {

}
