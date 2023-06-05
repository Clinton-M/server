package com.clix.server_v1.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "products")
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private List<Image> images;
    private String category;
    private String seller;
    private int stock;
    private double ratings;
    private List<Review> reviews;
    private Date createdAt;
}
