package com.clix.server_v1.model;

import lombok.Data;

import java.util.Date;

@Data
public class Review {
    private double rating;
    private String comment;
    private Date createdAt;
}