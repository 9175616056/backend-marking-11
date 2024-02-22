package com.marketing.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketing.entities.banglow;
import com.marketing.repository.Repository;

@RestController
@RequestMapping("/api/rohan")
public class rest {

	@Autowired
	private Repository repoo;
	
	//http://localhost:8080/api/rohan
	@GetMapping
	public List<banglow> listte() {
	     List<banglow> findAll = repoo.findAll();
	     return findAll;
		}
	
	@PostMapping
	public void onesave(@RequestBody banglow house) {
		repoo.save(house);
		
	}
	@PutMapping
	public void update(@RequestBody banglow house) {
		repoo.save(house);
		
	}
	@DeleteMapping("/delete/{id}")
	public void deletee(@PathVariable("id") long id) {
		repoo.deleteById(id);
		
	}
	@RequestMapping("/find/{id}")
	public banglow updatee(@PathVariable("id")long id) {
	       Optional<banglow> findById = repoo.findById(id);
	       banglow banglow = findById.get();
			return banglow;
		}

	
}
