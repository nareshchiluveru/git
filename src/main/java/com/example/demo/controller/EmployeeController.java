package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/emp")
@RequiredArgsConstructor
public class EmployeeController {

	private EmployeeService empService;

	@PostMapping("/save")
	public String saveEmployee(@RequestBody Employee emp) {
		return "Save Employee Successfully";
	}

	@GetMapping("/getAll")
	public List<Employee> getAllEmp() {
		return empService.getAllEmp();
	}

}
