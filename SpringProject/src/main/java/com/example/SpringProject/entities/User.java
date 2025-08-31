package com.example.SpringProject.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Data
@Entity
@Table(name = "user_")
public class User {

    @Id
    private int id;
    private String name;
    @Embedded
    private ContactDetails contactDetails;
}
