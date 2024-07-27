package br.com.brnocorreia.apiufbaenhacer.dao;

import br.com.brnocorreia.apiufbaenhacer.domain.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    boolean existsByCode(String code);
}
