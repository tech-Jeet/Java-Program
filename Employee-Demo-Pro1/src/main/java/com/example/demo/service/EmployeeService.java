package com.example.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Employee;
import com.example.demo.model.EmployeeVo;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Override
	public void saveEmployee(EmployeeVo employeeVo) {
		
		Employee employee = new Employee();
		BeanUtils.copyProperties(employeeVo, employee);
		employeeRepo.saveAndFlush(employee);
	}

}
