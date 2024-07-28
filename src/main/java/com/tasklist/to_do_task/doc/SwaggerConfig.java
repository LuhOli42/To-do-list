package com.tasklist.to_do_task.doc;

import java.util.Arrays;
import java.util.HashSet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
public class SwaggerConfig {

  private Contact contato() {
    return new Contact(
      "Luiza Ferreira",
      "https://github.com/LuhOli42",
      "luh.oli.42@gmail.com"
    );
  }

  private ApiInfoBuilder informacoesApi() {
    ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

    apiInfoBuilder.title("To-do-list");
    apiInfoBuilder.description(
      "Api-Rest para criação de tarefas, exclusão e listagem"
    );
    apiInfoBuilder.version("1.0");
    apiInfoBuilder.termsOfServiceUrl("Termo de uso:Open source");
    apiInfoBuilder.contact(this.contato());

    return apiInfoBuilder;
  }

  @Bean
  public Docket api() {
    Docket docket = new Docket(DocumentationType.SWAGGER_2);
    docket
      .select()
      .apis(
        RequestHandlerSelectors.basePackage(
          "com.tasklist.to_do_task.controller"
        )
      )
      .paths(PathSelectors.any())
      .build()
      .apiInfo(this.informacoesApi().build())
      .consumes(new HashSet<>(Arrays.asList("application/json")))
      .produces(new HashSet<>(Arrays.asList("application/json")));

    System.err.println(docket);
    return docket;
  }
}
