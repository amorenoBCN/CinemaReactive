package com.cinemaReactive.cinemaReactive.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class Cinema {

    @Id
    private String id;

    private String name;
    private String billboard;

}
