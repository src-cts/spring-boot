package com.howtodoinjava.example.yaml;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "config")
public class YamlProperties {

	private static final Logger LOG = LoggerFactory.getLogger(YamlProperties.class);

	private String ip;

	private String serverURL;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getServerURL() {
		return serverURL;
	}

	public void setServerURL(String serverURL) {
		this.serverURL = serverURL;
	}


	@Override
	public String toString() {
		return "YamlProperties [ip=" + ip + ", serverURL=" + serverURL + "]";
	}

	@PostConstruct
	public void init() {
		LOG.info("Init {} {}", ip, serverURL);
	}

}
