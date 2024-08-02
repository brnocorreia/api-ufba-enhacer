package br.com.brnocorreia.apiufbaenhacer.service;

import br.com.brnocorreia.apiufbaenhacer.dao.CourseRepository;
import br.com.brnocorreia.apiufbaenhacer.domain.dto.CoursePayload;
import br.com.brnocorreia.apiufbaenhacer.domain.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public ResponseEntity<Course> create(CoursePayload payload) {

        if (courseRepository.existsByCode(payload.getCode())) {
            return ResponseEntity.badRequest().build();
        }

        Course course = Course.from(payload);
        courseRepository.save(course);

        return ResponseEntity.ok().body(course);
    }

    public ResponseEntity<List<Course>> getAll() {
        return ResponseEntity.ok(courseRepository.findAll());
    }
}
