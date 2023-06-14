package com.example.jforce.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class DemoRestServices {

	@RequestMapping(path = "/list", method = RequestMethod.GET)
	public ResponseEntity<List<String>> getStudentListesi() {
		List<String> list = new ArrayList<String>();
		list.add("test");
		list.add("test2");
		return ResponseEntity.ok(list);
	}

}
