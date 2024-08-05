package br.com.brnocorreia.apiufbaenhacer.dao;

import br.com.brnocorreia.apiufbaenhacer.domain.entities.Course;
import br.com.brnocorreia.apiufbaenhacer.domain.entities.Discipline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    boolean existsByCode(Integer code);

    Course findByCode(Integer code);
}
