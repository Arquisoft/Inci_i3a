package com.uniovi.i3a;

import static com.google.common.base.Predicates.or;
import static com.google.common.collect.Lists.newArrayList;
import static springfox.documentation.builders.PathSelectors.regex;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ImplicitGrantBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.GrantType;
import springfox.documentation.service.LoginEndpoint;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2 // Enable swagger 2.0 spec
public class SwaggerConfig {

	@Value("${endpointAgents}")
	private String agentsEndpoint;

	@Bean
    public UiConfiguration uiConfig() {
        return new UiConfiguration(null);
    }
	
	@Bean
	public Docket agents_api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Inci_i3a")
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.uniovi.i3a.web"))
				.paths(agentsPaths()).build()
				.apiInfo(apiInfo()) 
				.enableUrlTemplating(true);
	}
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Inci_i3b")
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.uniovi.i3a.web"))
				.paths(agentsPaths()).build()
				.apiInfo(apiInfo()) 
				.enableUrlTemplating(true);
	}
	
	private Predicate<String> agentsPaths() {
		return or(regex("/info"), regex("/auth"), regex("/register"));
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Inci_i3a API")
				
				.description("Documentation for Arquisoft/inci_i3a incidence system.")
				.termsOfServiceUrl("https://github.com/arquisoft/inci_i3a")
				.contact("https://github.com/arquisoft/inci_i3a")
				.license("Apache License Version 2.0")
				.licenseUrl("https://github.com/arquisoft/inci_i3a").version("1.0").build();
	}

	List<GrantType> grantTypes() {
		GrantType grantType = new ImplicitGrantBuilder().loginEndpoint(new LoginEndpoint(agentsEndpoint)).build();
		return newArrayList(grantType);
	}
	
	/*
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/agents").allowedOrigins(agentsEndpoint);
				registry.addMapping("/v2/api-docs.*").allowedOrigins("http://editor.swagger.io");
			}
		};
	}
	*/
}
