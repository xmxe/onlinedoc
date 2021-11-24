package com.xmxe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * Knife4j 配置类
 */
@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfiguration {

	@Bean(value = "defaultDocket")
	public Docket defaultDocket() {
		// 联系人信息
		Contact contact = new Contact("123", "https://www.javastack.cn", "xx@javastack.cn");

		// 创建 Docket
		Docket docket = new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(new ApiInfoBuilder()
						.title("Knife4j 测试")
						.description("Knife4j Test")
						.termsOfServiceUrl("https://www.javastack.cn")
						.contact(contact)
						.version("1.0")
						.build())
				.groupName("1.x")
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.xmxe"))
				.paths(PathSelectors.any())
				.build();
		return docket;
	}

}