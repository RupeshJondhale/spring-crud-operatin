package com.crud.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.demo.entity.Employee;
import com.crud.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService em;

	@GetMapping("getdata")
	public List<Employee> list() {
		return em.list();

	}

	// GET: Reads a resource
	@GetMapping("getbyid/{id}")
	public Employee getbyId(@PathVariable int id) {
		System.out.println(em.getbyId(id));
		return em.getbyId(id);
	}

	// delete data from existing resource
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable int id) {
		em.delete(id);

	}

	// PUT: Updates an existing resource
	@PutMapping("addata")
	public Employee Employee(@RequestBody Employee employee) {

		em.saveOrUpdate(employee);
		return employee;
	}

	// Creates or insert a new resource
	@PostMapping("putdata")
	public Employee update(@RequestBody Employee employee) {

		em.saveOrUpdate(employee);
		return employee;
	}

}
