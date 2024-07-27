package br.com.brnocorreia.apiufbaenhacer.dao;

import br.com.brnocorreia.apiufbaenhacer.domain.entities.Discipline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplineRepository extends JpaRepository<Discipline, Long> {
    boolean existsByCode(String code);
}
