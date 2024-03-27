package br.com.fullstack.m1s9.repository;

import br.com.fullstack.m1s9.entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

}
