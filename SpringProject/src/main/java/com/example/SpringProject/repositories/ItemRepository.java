package com.example.SpringProject.repositories;

import com.example.SpringProject.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
