package br.com.brnocorreia.apiufbaenhacer.controller;

import br.com.brnocorreia.apiufbaenhacer.domain.dto.CoursePayload;
import br.com.brnocorreia.apiufbaenhacer.domain.dto.CourseResponse;
import br.com.brnocorreia.apiufbaenhacer.domain.dto.CourseWithDisciplinesDTO;
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
    public ResponseEntity<List<CourseResponse>> getAllCourses() {
        return courseService.getAll();
    }

    @GetMapping("/{code}")
    public ResponseEntity<CourseResponse> getCourseByCode(@PathVariable Integer code) {
        return courseService.getByCode(code);
    }
}
