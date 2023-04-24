package com.example.demo.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "customSequences")
public class CustomSequences {
    @Id
    private String id;
    private long seq;
}
