package br.com.brnocorreia.apiufbaenhacer.domain.dto;

import br.com.brnocorreia.apiufbaenhacer.domain.entities.Course;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CourseWithDisciplinesDTO {

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

    private List<DisciplineResponse> obligatoryDisciplines;
    private List<DisciplineResponse> optionalDisciplines;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static CourseWithDisciplinesDTO from(Course course) {
        return new CourseWithDisciplinesDTO(
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
                null,
                null,
                course.getCreatedAt(),
                course.getUpdatedAt()
        );
    }
}
