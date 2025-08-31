package com.example.SpringProject.entities;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class ContactDetails {

    private String phone;
    private String email;
    private String address;
}
