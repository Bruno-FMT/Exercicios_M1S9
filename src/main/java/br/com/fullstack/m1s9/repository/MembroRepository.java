package br.com.fullstack.m1s9.repository;

import br.com.fullstack.m1s9.entity.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembroRepository extends JpaRepository<MembroEntity, Long> {
}
