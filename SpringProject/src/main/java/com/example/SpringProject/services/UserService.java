package com.example.SpringProject.services;

import com.example.SpringProject.entities.User;
import com.example.SpringProject.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public void add(User user) {
        userRepository.save(user);
    }

    public String delete(int id) {
        if(userRepository.existsById(id)) {
            User user = userRepository.findById(id).get();
            userRepository.delete(user);
            return user.getName()+" deleted";
        }
        return "user not exist";
    }

    public String update(User user, int id) {
        if(userRepository.existsById(id)) {
            User user1 = userRepository.findById(id).get();
            user.setId(user1.getId());
            userRepository.save(user);
            return user.getName()+" updated";
        }
        return "user not exist";
    }
}
