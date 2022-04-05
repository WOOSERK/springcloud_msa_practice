package com.example.restfulwebservice.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by WOOSERK.
 * User: WOOSERK
 * Date: 2022-04-03
 * Time: 오전 3:17
 */

@Configuration
public class SwaggerConfig
{
    private static final Contact DEFAULT_CONTACT = new Contact("Wooserknim",
        "http://www.withwooserknim.co.kr", "wooserknim@naver.com");

    private static final Info DEFAULT_API_INFO = new Info("Awesome API Title",
            "My User management REST API service", "1.0", "urn:tos",
            "Apache 2.0",
            "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<>()).contact(DEFAULT_CONTACT).license(new License().name());

    private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<>(
            Arrays.asList("application/json", "application/xml"));

    @Bean
    public OpenAPI api()
    {
        return new OpenAPI()
                .info(DEFAULT_API_INFO)
                .produces(DEFAULT_PRODUCES_AND_CONSUMES)
                .consumes(DEFAULT_PRODUCES_AND_CONSUMES);
    }
}
