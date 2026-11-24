package com.bxom.pl41gateway.filter;

import com.bxom.pl41gateway.handler.TestingHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;

@Configuration
public class RouterFunctionConfiguration {
    @Autowired
    private TestingHandler testingHandler;

    @Bean
    public RouterFunction routerFunction() {
        return RouterFunctions.route(
                RequestPredicates.GET("/test").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                testingHandler);
    }
}
