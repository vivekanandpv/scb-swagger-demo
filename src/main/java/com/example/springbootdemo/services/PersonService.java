package com.example.springbootdemo.services;

import java.util.List;

import com.example.springbootdemo.models.Person;

public interface PersonService {
	List<Person> getAll();
	Person getById(int id);
	Person create(Person person);
	Person update(int id, Person person);
	void delete(int id);
}
