package com.example.demo.models.dtos;

import com.example.demo.models.entities.Character;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CharacterList {
    private String name;
    private List<CharacteristicList> characteristicLists;

    public CharacterList() {
        this.characteristicLists = new ArrayList<>();
    }

    public static CharacterList from(Character c) {
        CharacterList characterList = new CharacterList();
        characterList.setName(c.getName());

        c.getEntityCharacteristicList().stream().forEach(ec -> characterList.getCharacteristicLists().add(CharacteristicList.from(ec)));

        return characterList;
    }
}
