package com.howtodoinjava.example.yaml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YamlTestController {

	@Autowired
	private EmployeeYamlList employeeList;

	@Autowired
	private EmployeeYamlMap employeeMap;

	@RequestMapping("/")
	public String showEmployeeDetails() {

		return "Employee List:: " + employeeList.getEmployees().toString() + "\n\n Employee Map:: "
				+ employeeMap.getEmployees().toString();
	}

}
