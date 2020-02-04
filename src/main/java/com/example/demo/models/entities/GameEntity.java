package com.example.demo.models.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"name"})
@AllArgsConstructor
@NoArgsConstructor
public abstract class GameEntity implements Serializable {
    @Id
    @Column(name = "Entity_ID")
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @Column(name= "Entity_Name", unique = true, nullable = false)
    private String name;
    @Column(name = "Entity_Lvl", nullable = false)
    private int lvl;

    @ManyToMany(targetEntity = Race.class)
    private List<Race> raceList;

    @OneToMany(targetEntity = EntityCharacteristic.class, mappedBy = "entity")
    private List<EntityCharacteristic> entityCharacteristicList;
}
