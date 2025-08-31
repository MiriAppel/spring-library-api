package com.example.SpringProject.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "item_")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Item {

    @Id
    private int id;
    private String name;
}
