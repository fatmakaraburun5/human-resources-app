package com.example.jforce.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jforce.demo.modal.Inventory;
import com.example.jforce.demo.repository.InventoryRepository;

@Service	
public class InventoryServiceImpl implements IInventoryService{
	
	@Autowired
	InventoryRepository inventoryRepository;
	
	@Override
	public List<Inventory> listAll() { //listDepartments döndürdüğü için return kullanılır 
		return  inventoryRepository.findAll();
	}

	@Override
	public void delete(Long id) { //voidde return edilmez, yalnızca iş yapar 
		inventoryRepository.deleteById(id);
	}

	@Override
	public Inventory update(Inventory inventory) {
		return  inventoryRepository.save( inventory);
	}

	@Override
	public List<Inventory> insertAll(List<Inventory> newinventoryList) {
		return  inventoryRepository.saveAll(newinventoryList); // liste olduğu için saveAll
	}

	@Override
	public Inventory insert(Inventory inventory) {
		return inventoryRepository.save(inventory);
	}	
	
	

}
