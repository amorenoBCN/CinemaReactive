package com.cinemaReactive.cinemaReactive.repository;

import com.cinemaReactive.cinemaReactive.entity.Cinema;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CinemaRepository extends ReactiveMongoRepository<Cinema, String> {

}
