package com.example.SpringProject.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Magazine extends Item {

    private String year_;
    private String sheetNumber;
}
