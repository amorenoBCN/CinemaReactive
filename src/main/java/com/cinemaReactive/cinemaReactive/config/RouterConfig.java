package com.cinemaReactive.cinemaReactive.config;

import com.cinemaReactive.cinemaReactive.handlers.CinemaHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterConfig {

    @Bean
    public RouterFunction<ServerResponse> routes(CinemaHandler handler){
        return RouterFunctions.route(RequestPredicates.POST("/api/reactive/create-cinema"), handler::saveCinema);
    }

}
