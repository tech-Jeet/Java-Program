package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeVo;
import com.example.demo.service.IEmployeeService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("api/v1/")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@ApiOperation("save employee")
	@PostMapping("/employee/save")
	public ResponseEntity<String> saveEmployee(@RequestBody EmployeeVo employeeVo) {
		employeeService.saveEmployee(employeeVo);
		return new ResponseEntity<String>("Record Inserted", HttpStatus.OK);
	}

}
