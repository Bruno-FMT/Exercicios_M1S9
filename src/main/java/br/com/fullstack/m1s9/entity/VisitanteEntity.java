package br.com.fullstack.m1s9.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "visitantes")
public class VisitanteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String telefone;

}
