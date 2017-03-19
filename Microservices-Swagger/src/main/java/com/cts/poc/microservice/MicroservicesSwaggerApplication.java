package com.cts.poc.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MicroservicesSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesSwaggerApplication.class, args);
	}
	
	@Bean
    public Docket newsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.apiInfo(apiInfo());
	} 
	
	private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Microservices with Swagger")
                .description("Microservices Demo with Swagger")
                .termsOfServiceUrl("jhkjh")
                .contact(new Contact("Sudip RC", "http://localhost", "sudiprc@src.com"))
                .license("Apache License Version 2.0")
                .licenseUrl("nmnv")
                .version("2.6")
                .build();
    }
}
