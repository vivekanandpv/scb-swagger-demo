package com.example.springbootdemo.apis;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootdemo.exceptions.RecordNotFoundException;
import com.example.springbootdemo.models.Person;
import com.example.springbootdemo.services.PersonService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("api/v1/persons")
@Api(value = "persons", tags = {"Person API"})
public class PersonApi {
	private final PersonService service;	

	public PersonApi(PersonService service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<List<Person>> getAll() {
		return ResponseEntity.ok(service.getAll());
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Person> getById(@PathVariable int id) {
		return ResponseEntity.ok(service.getById(id));
	}
	
	@PostMapping
	public ResponseEntity<Person> create(@RequestBody Person person) {
		return ResponseEntity.ok(service.create(person));
	} 
	
	@PutMapping("{id}")
	public ResponseEntity<Person> update(@PathVariable int id, @RequestBody Person person) {
		return ResponseEntity.ok(service.update(id, person));
	}
	
	@PatchMapping("{id}")
	public ResponseEntity<Person> updatePatch(@PathVariable int id, @RequestBody Person person) {
		return ResponseEntity.ok(service.update(id, person));
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> delteById(@PathVariable int id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}
