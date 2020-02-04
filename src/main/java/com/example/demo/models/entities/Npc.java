package com.example.demo.models.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Npc extends GameEntity implements Serializable {
    @Enumerated(EnumType.STRING)
    @Column(name= "Npc_Job", nullable = false)
    private Metier metier;
}
