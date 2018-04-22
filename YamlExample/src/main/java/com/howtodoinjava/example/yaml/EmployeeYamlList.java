package com.howtodoinjava.example.yaml;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "employeeList")
public class EmployeeYamlList {

	private static final Logger LOG = LoggerFactory.getLogger(EmployeeYamlList.class);

	private List<Employee> employees = new ArrayList<>();

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "EmployeeYamlList [employees=" + employees + "]";
	}

}
