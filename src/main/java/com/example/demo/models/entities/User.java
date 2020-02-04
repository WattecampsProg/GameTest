package com.example.demo.models.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Game_User")
public class User implements Serializable {
    @Id
    @Column(name = "User_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "User_Username", unique = true, nullable = false)
    private String username;
    @Column(name = "User_Password", nullable = false)
    private String password;

    @OneToMany(targetEntity = Character.class)
    private List<Character> characterList;
}
