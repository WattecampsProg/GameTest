package com.example.demo.services.user;

import com.example.demo.models.entities.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return this.repository.findByUsername(username);
    }

    @Override
    public List<User> findAll() {
        return (List<User>) this.repository.findAll();
    }

    @Override
    public User save(User user) {
        return this.repository.save(user);
    }

    @Override
    public User update(Long id, User user) {
        Optional<User> toUpdate = this.repository.findById(id);

        if (!toUpdate.isPresent()) {
            throw new EntityNotFoundException();
        }

        User toUpdateUser = toUpdate.get();
        toUpdateUser.setUsername(user.getUsername());
        toUpdateUser.setPassword(user.getPassword());
        toUpdateUser.setCharacterList(user.getCharacterList());

        return this.repository.save(toUpdateUser);
    }

    @Override
    public void remove(User user) {
        this.repository.delete(user);
    }
}
