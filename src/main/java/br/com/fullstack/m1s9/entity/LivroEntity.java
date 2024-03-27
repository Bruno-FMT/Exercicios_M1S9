package br.com.fullstack.m1s9.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "livros")
public class LivroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 80)
    private String titulo;

    @Column(nullable = false, length = 80)
    private String autor;

    @Column(nullable = false)
    private LocalDate ano_publicacao;

    private int edicao;

    // Relação com empréstimos (Um livro pode ter vários empréstimos)
    @OneToMany(mappedBy = "id")
    private List<EmprestimoEntity> emprestimoEntity;
}
