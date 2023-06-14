package com.example.jforce.demo.services;

import java.util.List;

import com.example.jforce.demo.modal.Inventory;

public interface IInventoryService {
	
	List<Inventory> listAll();

	void delete(Long id);

	Inventory update(Inventory inventory);

	List<Inventory> insertAll(List<Inventory> newinventoryList);

	Inventory insert(Inventory inventory);

}
