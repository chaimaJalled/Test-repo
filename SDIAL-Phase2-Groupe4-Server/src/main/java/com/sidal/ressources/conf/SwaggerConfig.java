package com.sidal.ressources.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ComponentScan("com.sdial.ressources.controller")

public class SwaggerConfig {

	/**
	 *
	 * @return Docket
	 */
	@Bean
	public Docket api() {

		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).useDefaultResponseMessages(false).select()
				.apis(RequestHandlerSelectors.basePackage("com.sdial.ressources.controller"))
				.build();
	}

	/**
	 *
	 * @return ApiInfo
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Projet Sessions")
				.description("APIs Rest exposés dans le code du projet Session").version("1.0")
				.termsOfServiceUrl("Terms of service")
				.contact(new Contact("IATIC5", "https://isty.fr", "groupe9@isty.fr"))
				.license("Copyright (C) ISTY Groupe 9").licenseUrl("https://isty.fr").build();
	}
}
