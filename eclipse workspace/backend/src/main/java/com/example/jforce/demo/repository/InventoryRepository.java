package com.example.jforce.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jforce.demo.modal.Inventory;

public interface InventoryRepository  extends JpaRepository<Inventory, Long>{

}
