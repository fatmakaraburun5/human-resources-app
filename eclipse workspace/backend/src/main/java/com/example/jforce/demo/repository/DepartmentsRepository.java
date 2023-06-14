package com.example.jforce.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.jforce.demo.modal.Departments;

public interface DepartmentsRepository  extends JpaRepository<Departments, Long>{

}
