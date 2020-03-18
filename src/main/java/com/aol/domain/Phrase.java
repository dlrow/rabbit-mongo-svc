package com.aol.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;


@Data
@Document(collection = "phrase")
public class Phrase implements Serializable {


    @Id
    String id;

    String routingKey;

    String phrase;

    Status status;

}
