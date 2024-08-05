package br.com.brnocorreia.apiufbaenhacer.service;

import br.com.brnocorreia.apiufbaenhacer.dao.CourseRepository;
import br.com.brnocorreia.apiufbaenhacer.domain.dto.*;
import br.com.brnocorreia.apiufbaenhacer.domain.entities.Course;
import br.com.brnocorreia.apiufbaenhacer.domain.entities.Discipline;
import br.com.brnocorreia.apiufbaenhacer.domain.enums.RelationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private DisciplineService disciplineService;

    public ResponseEntity<Course> create(CoursePayload payload) {

        if (courseRepository.existsByCode(payload.getCode())) {
            return ResponseEntity.badRequest().build();
        }

        Course course = Course.from(payload);
        courseRepository.save(course);

        return ResponseEntity.ok().body(course);
    }

    public ResponseEntity<List<CourseResponse>> getAll() {
        List<Course> courses = courseRepository.findAll();

        List<CourseResponse> courseResponses = courses.stream().map(CourseResponse::from).toList();

        return ResponseEntity.ok(courseResponses);
    }

    public ResponseEntity<CourseResponse> getByCode(Integer code) {
        Course course = courseRepository.findByCode(code);

        return ResponseEntity.ok(CourseResponse.from(course));
    }
}
