package br.com.fullstack.m1s9.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "membros")
public class MembroEntity {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 70)
    private String nome;

    @Column(length = 150)
    private String endereco;

    @Column(nullable = false, length = 15)
    private String telefone;

    // Relacionamento com empréstimos (Um membro pode ter vários empréstimos)
    @OneToMany(mappedBy = "id")
    private List<EmprestimoEntity> emprestimoEntity;

}
