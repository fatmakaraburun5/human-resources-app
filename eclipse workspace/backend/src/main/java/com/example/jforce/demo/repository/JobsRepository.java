package com.example.jforce.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jforce.demo.modal.Jobs;

public interface JobsRepository extends JpaRepository<Jobs, Long> {

}
