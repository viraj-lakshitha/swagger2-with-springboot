package com.example.swagger2withspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class Swagger2WithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Swagger2WithSpringBootApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/v1/*")) // Read only apis that starting with /v1/*
				.apis(RequestHandlerSelectors.basePackage("com.example"))
				.build()
				.apiInfo(apiDetails());
	}

	public ApiInfo apiDetails() {
		return new ApiInfo(
				"Swagger2WithSpringBoot",
				"Simple integration with swagger 2",
				"1.0.0",
				"http://localhost:8080",
				new Contact("Viraj Lakshitha", "https://github.com/viraj-lakshitha", "viraj@limarktech.com"),
				"API License",
				"https://github.com/viraj-lakshitha",
				Collections.emptyList()
		);
	}
}