package coop.home.backacount.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
class SwaggerConfiguracion {
	
	@Bean
	ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Banck Acount - Test Project")
				.description("Best practices in action.")
				.license("Apache 2.0").licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
				.termsOfServiceUrl("").version("1.0.0")
				.contact(new springfox.documentation.service.Contact("Test  - Home", "",
						"czar8a@gmail.com"))
				.build();
	}
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("coop.home.backacount.controller")).paths(PathSelectors.any())
				.build().apiInfo(apiInfo());
	}
	
}
