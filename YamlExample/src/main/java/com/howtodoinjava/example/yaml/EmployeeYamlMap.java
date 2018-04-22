package com.howtodoinjava.example.yaml;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "employeeMap")
public class EmployeeYamlMap {

	private static final Logger LOG = LoggerFactory.getLogger(EmployeeYamlMap.class);

	private Map<Integer, Employee> employees;

	public Map<Integer, Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Map<Integer, Employee> employees) {
		this.employees = employees;
	}

	@PostConstruct
	public void init() {
		LOG.info("EmployeeYamlMap init {}", employees);
	}

	@Override
	public String toString() {
		return "EmployeeYamlMap [employeeMap=" + employees + "]";
	}

}
