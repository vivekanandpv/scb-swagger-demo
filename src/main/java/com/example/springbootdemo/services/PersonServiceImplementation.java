package com.example.springbootdemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springbootdemo.exceptions.RecordNotFoundException;
import com.example.springbootdemo.models.Person;

@Service
public class PersonServiceImplementation implements PersonService {

	@Override
	public List<Person> getAll() {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1, "Hari", "Rajan", "hari@gmail.com"));
		persons.add(new Person(2, "Anusha", "K", "anusha@gmail.com"));
		return persons;
	}

	@Override
	public Person getById(int id) {
		// TODO Auto-generated method stub
		if (id <= 0) {
			throw new ArithmeticException("Negative id " + id);
		}
		return new Person(id, "Anusha", "K", "anusha@gmail.com");
	}

	@Override
	public Person create(Person person) {
		// TODO Auto-generated method stub
		return person;
	}

	@Override
	public Person update(int id, Person person) {
		// TODO Auto-generated method stub
		if (id <= 0) {
			throw new RecordNotFoundException("Negative id " + id);
		}
		return person;
	}

	@Override
	public void delete(int id) {
		if (id <= 0) {
			throw new RecordNotFoundException("Negative id " + id);
		}
		// TODO Auto-generated method stub
		System.out.println("deleting the id " + id);
	}

}
