package br.com.fullstack.m1s9.repository;

import br.com.fullstack.m1s9.entity.BibliotecarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {
}
