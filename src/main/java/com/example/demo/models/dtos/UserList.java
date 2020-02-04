package com.example.demo.models.dtos;

import com.example.demo.models.entities.Character;
import com.example.demo.models.entities.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserList {
    private Long id;
    private String username;
    private List<CharacterList> characterLists;

    public UserList() {
        this.characterLists = new ArrayList<>();
    }

    public static UserList from(User user) {
        UserList item = new UserList();
        item.setId(user.getId());
        item.setUsername(user.getUsername());

        user.getCharacterList().stream().forEach(c -> item.getCharacterLists().add(CharacterList.from(c)));

        return item;
    }
}
