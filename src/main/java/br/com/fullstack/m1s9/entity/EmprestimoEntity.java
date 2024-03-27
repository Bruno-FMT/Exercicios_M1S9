package br.com.fullstack.m1s9.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "emprestimos")
public class EmprestimoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "livro_id", nullable = false)
    private LivroEntity livroEntity;

    @ManyToOne
    @JoinColumn(name = "membro_id", nullable = false)
    private MembroEntity membroEntity;

    @Column(nullable = false)
    private LocalDate dataEmprestimo = LocalDate.now();

    private LocalDate dataDevolucao = dataEmprestimo.plusDays(7);

}
