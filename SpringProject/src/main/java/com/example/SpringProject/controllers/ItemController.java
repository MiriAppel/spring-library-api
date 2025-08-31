package com.example.SpringProject.controllers;

import com.example.SpringProject.entities.Item;
import com.example.SpringProject.entities.User;
import com.example.SpringProject.services.ItemService;
import com.example.SpringProject.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/item")
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/getAll")
    public List<Item> getAll() {
        return itemService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Item item) {
        itemService.add(item);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return itemService.delete(id);
    }

    @PutMapping("/update/{id}")
    public String update(@RequestBody Item item, @PathVariable int id) {
        return itemService.update(item, id);
    }
}
