package com.example.SpringProject.controllers;

import com.example.SpringProject.entities.User;
import com.example.SpringProject.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/helloName/{name}")
    public String helloName(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/getAll")
    public List<User> getAll() {
        return userService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody User user) {
        userService.add(user);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return userService.delete(id);
    }

    @PutMapping("/update/{id}")
    public String update(@RequestBody User user, @PathVariable int id) {
        return userService.update(user, id);
    }
}
