package com.example.challenge2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Document
public class Customer {
    @Id
    private int customerId ;
    private String customerFirstName ;
    private String customerLastName ;
    private String customerEmail ;


}
