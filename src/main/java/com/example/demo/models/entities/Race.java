package com.example.demo.models.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Game_Race")
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"libelle"})
@AllArgsConstructor
@NoArgsConstructor
public class Race implements Serializable {
    @Id
    @Column(name = "race_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "race_libelle", unique = true, nullable = false)
    private String libelle;
}
