package com.example.jforce.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jforce.demo.modal.Inventory;
import com.example.jforce.demo.services.IInventoryService;

@RestController
public class InventoryController {

	@Autowired 
	IInventoryService iInventoryService;
	
	@GetMapping(path = "/InventoryList") 
	public List<Inventory> getPersons(){
		return iInventoryService.listAll();
	}
	
	@DeleteMapping(path = "/deleteInventory/{id}")
	public void deleteInventory(@PathVariable(name = "id") Long id ) {
		iInventoryService.delete(id);
	}
	
	@PostMapping (path = "/updateInventory")
	public Inventory updateInventory(@RequestBody Inventory inventory) {
		return iInventoryService.update(inventory);
	}
	
	@PostMapping (path = "/insertInventory")
	public Inventory insertInventory(@RequestBody Inventory inventory) {
		return iInventoryService.insert(inventory);
	}
	
	@PostMapping (path = "/insertAllInventory")
	public List<Inventory> insertAllInventory (@RequestBody List<Inventory> inventory) {
		return iInventoryService.insertAll(inventory);
	}	
	
	
}
