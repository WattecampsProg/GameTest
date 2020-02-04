package com.example.demo.models.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class EntityCharacteristic implements Serializable {
    @Id
    @ManyToOne(targetEntity = GameEntity.class)
    private GameEntity entity;
    @Id
    @ManyToOne(targetEntity = Characteristic.class)
    private Characteristic characteristic;

    private int value;

}
