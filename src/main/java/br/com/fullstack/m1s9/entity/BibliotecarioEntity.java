package br.com.fullstack.m1s9.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "bibliotecarios")
public class BibliotecarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false, length = 70)
    private String nome;

    @Column(length = 80)
    private String email;

    @Column(nullable = false, length = 10)
    private String senha;
}
