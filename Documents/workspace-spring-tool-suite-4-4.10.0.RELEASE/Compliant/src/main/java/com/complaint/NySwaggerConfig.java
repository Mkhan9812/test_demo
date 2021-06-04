package com.complaint;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;





@Configuration
@EnableSwagger2

public class NySwaggerConfig {
@Bean
public Docket docket()  {
	return new Docket(DocumentationType.SWAGGER_2)
			.apiInfo(apiInfo()).select()
			.apis(RequestHandlerSelectors
			.basePackage("com.complaint"))
			.build();
}

private ApiInfo apiInfo() {
	return new ApiInfoBuilder()
			.title("CONSUMER SERVICE")
			.description("Here you can ADD & Track Status of Complaint")
			.build();
}

}
		