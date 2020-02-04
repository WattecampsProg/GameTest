package com.example.demo.models.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Game_Character")
public class Character extends GameEntity implements Serializable {
    @Column(nullable = false, name = "Character_Lastname")
    private String lastName;
}
