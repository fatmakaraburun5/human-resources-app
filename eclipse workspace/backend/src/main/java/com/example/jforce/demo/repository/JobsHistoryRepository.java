package com.example.jforce.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jforce.demo.modal.JobsHistory;

public interface JobsHistoryRepository extends JpaRepository<JobsHistory, Long> {

}
