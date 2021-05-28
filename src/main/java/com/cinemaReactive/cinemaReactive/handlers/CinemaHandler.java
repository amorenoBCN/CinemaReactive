package com.cinemaReactive.cinemaReactive.handlers;

import com.cinemaReactive.cinemaReactive.entity.Cinema;
import com.cinemaReactive.cinemaReactive.repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class CinemaHandler {

    @Autowired
    private CinemaRepository cinemaRepository;

    public Mono<ServerResponse> saveCinema(ServerRequest request){
        Mono<Cinema> cinemaMono = request.bodyToMono(Cinema.class);

        return cinemaMono.flatMap(cinema -> {
            return cinemaRepository.save(cinema);
        }).flatMap(response -> ServerResponse
                .status(201)
                .body(BodyInserters.fromValue(response)));
    }

}
