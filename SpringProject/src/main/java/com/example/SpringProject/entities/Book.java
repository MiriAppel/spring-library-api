package com.example.SpringProject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
@Entity
public class Book extends Item {

    private String author;
    private String title;
    @Enumerated(EnumType.ORDINAL)
    private Category category;
}
