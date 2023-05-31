package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.repository.EmployeeRespository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {

	private EmployeeRespository empRepo;

	public void saveEmp(Employee emp) {
		empRepo.save(emp);
	}
	
	public List<Employee> getAllEmp(){
		return empRepo.findAll();	
	}
}
