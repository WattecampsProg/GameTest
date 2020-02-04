package com.example.demo.models.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Game_Characteristic")
@Getter
@Setter
@ToString()
@EqualsAndHashCode()
@AllArgsConstructor
@NoArgsConstructor
public class Characteristic implements Serializable {
    @Id
    @Column(name = "Characteristic_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Characteristic_Libelle", nullable = false, unique = true)
    private String libelle;
}
