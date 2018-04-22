package com.howtodoinjava.example.yaml;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YamlTestController {

	private static final Logger LOG = LoggerFactory.getLogger(YamlTestController.class);

	@Resource
	private YamlProperties yamlProperties;

	@Value("${employee.name}")
	private String employeeName;

	@Value("${config.ip}")
	private String ipAddress;

	@Value("${customname.firstname}")
	private String firstname;

	@RequestMapping("/showCustomYamlPOJO")
	public String showCustomYamlPOJO() {
		return yamlProperties.toString();
	}

	@RequestMapping("/showYamlProperties")
	public String showYamlProperties() {
		LOG.info("employeeName {}", employeeName);
		LOG.info("ipAddress {}", ipAddress);
		LOG.info("firstname {}", firstname);
		return "employeeName:: " + employeeName + " , ipAddress:: " + ipAddress + ", firstname::" + firstname;
	}
}
