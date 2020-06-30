package com.shoppingcart.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class UserConfiguration {
	
	@Value("${api.swagger.title}")
	private String title;
	
	@Value("${api.swagger.description}")
	private String description;
	
	@Value("${api.swagger.version}")
	private String version;
	
	@Value("${api.swagger.createdBy}")
	private String createdBy;
	
	
	 @Bean
	    public Docket api() { 
		 Contact contact= new Contact(createdBy, null, null);
		 ApiInfo apiInfo = new ApiInfo(title, description, version, null, contact, null, null);
	       
			return new Docket(DocumentationType.SWAGGER_2)
			  .apiInfo(apiInfo)
	          .useDefaultResponseMessages(false)
	          .select()                                  
	          .apis(RequestHandlerSelectors.basePackage("com.shoppingcart.user"))              
	          .paths(PathSelectors.any())                          
	          .build();                                           
	    }

}
