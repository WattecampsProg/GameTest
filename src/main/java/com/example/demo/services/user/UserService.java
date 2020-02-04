package com.example.demo.services.user;

import com.example.demo.models.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    Optional<User> findByUsername(String username);
    List<User> findAll();
    User save(User user);
    User update(Long id, User user);
    void remove(User user);
}
