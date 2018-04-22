package com.howtodoinjava.example.yaml;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class YamlConfig {

	private static final Resource[] resources = { new ClassPathResource("config/custom-config.yml"),
			new ClassPathResource("myConfig.yml") };
	/**
	 * Custom yaml file loader
	 * @return
	 */
	@Bean
	public PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertyConfig = new PropertySourcesPlaceholderConfigurer();
		YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
		yaml.setResources(resources);
		propertyConfig.setProperties(yaml.getObject());
		return propertyConfig;
	}
}
