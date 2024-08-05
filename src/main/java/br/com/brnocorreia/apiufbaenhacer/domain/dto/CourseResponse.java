package br.com.brnocorreia.apiufbaenhacer.domain.dto;

import br.com.brnocorreia.apiufbaenhacer.domain.entities.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseResponse {
    private Integer courseId;
    private Integer code;
    private String name;
    private String shift;
    private Integer minDuration;
    private Integer maxDuration;
    private String legalBase;
    private String description;
    private Integer obWorkload;
    private Integer opWorkload;
    private Integer acWorkload;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static CourseResponse from(Course course) {
        return new CourseResponse(
                course.getCourseId(),
                course.getCode(),
                course.getName(),
                course.getShift(),
                course.getMinDuration(),
                course.getMaxDuration(),
                course.getLegalBase(),
                course.getDescription(),
                course.getObWorkload(),
                course.getOpWorkload(),
                course.getAcWorkload(),
                course.getCreatedAt(),
                course.getUpdatedAt()
        );
    }
}
