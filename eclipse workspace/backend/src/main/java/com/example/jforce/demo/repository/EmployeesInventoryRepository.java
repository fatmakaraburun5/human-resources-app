package com.example.jforce.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.jforce.demo.modal.EmployeesInventory;

public interface EmployeesInventoryRepository extends JpaRepository<EmployeesInventory, Long>{

}
