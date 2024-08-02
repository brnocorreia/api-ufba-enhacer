package br.com.brnocorreia.apiufbaenhacer.controller;

import br.com.brnocorreia.apiufbaenhacer.domain.dto.CoursePayload;
import br.com.brnocorreia.apiufbaenhacer.domain.entities.Course;
import br.com.brnocorreia.apiufbaenhacer.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping()
    public ResponseEntity<Course> createCourse(@RequestBody CoursePayload payload) {
        return courseService.create(payload);
    }

    @GetMapping()
    public ResponseEntity<List<Course>> getAllCourses() {
        return courseService.getAll();
    }
}
