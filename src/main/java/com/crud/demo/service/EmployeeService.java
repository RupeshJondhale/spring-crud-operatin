package com.crud.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.entity.Employee;
import com.crud.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	 EmployeeRepository employeeRepository;

	public List<Employee> list() {
		return employeeRepository.findAll();

	}

	public Employee getbyId(int id) {
		return employeeRepository.getById(id);
	}

	public void delete(int id) {
		employeeRepository.deleteById(id);

	}

	public void saveOrUpdate(Employee employee) {

		employeeRepository.save(employee);
	}

	public void update(Employee employee, int id)   
	{  
		employeeRepository.save(employee);  
	}  

}
