package com.example.demo.models.dtos;

import com.example.demo.models.entities.Characteristic;
import com.example.demo.models.entities.EntityCharacteristic;
import lombok.Data;

@Data
public class CharacteristicList {
    private String name;
    private int value;

    public static CharacteristicList from(EntityCharacteristic entityCharacteristic) {
        CharacteristicList characteristicList = new CharacteristicList();

        characteristicList.setName(entityCharacteristic.getCharacteristic().getLibelle());
        characteristicList.setValue(entityCharacteristic.getValue());

        return characteristicList;
    }
}
