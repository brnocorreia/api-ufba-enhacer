package br.com.brnocorreia.apiufbaenhacer.domain.entities;

import br.com.brnocorreia.apiufbaenhacer.domain.dto.CoursePayload;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer courseId;

    @Column(name = "code", nullable = false, unique = true)
    private String code;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "shift", nullable = false)
    private String shift;

    @Column(name = "min_duration", nullable = false)
    private Integer minDuration;

    @Column(name = "max_duration", nullable = false)
    private Integer maxDuration;

    @Column(name = "legal_base")
    private String legalBase;

    @Column(name = "description")
    private String description;

    @Column(name = "ob_workload", nullable = false)
    private Integer obWorkload;

    @Column(name = "op_workload", nullable = false)
    private Integer opWorkload;

    @Column(name = "ac_workload", nullable = false)
    private Integer acWorkload;

    @Column(name = "created_at", updatable = false)
    LocalDateTime createdAt;

    @Column(name = "updated_at")
    LocalDateTime updatedAt;

    public Course(final CoursePayload payload) {
        this.code = payload.getCode();
        this.name = payload.getName();
        this.shift = payload.getShift();
        this.minDuration = payload.getMinDuration();
        this.maxDuration = payload.getMaxDuration();
        this.legalBase = payload.getLegalBase();
        this.description = payload.getDescription();
        this.obWorkload = payload.getObWorkload();
        this.opWorkload = payload.getOpWorkload();
        this.acWorkload = payload.getAcWorkload();
    }

    public static Course from(CoursePayload payload) {
        return new Course(payload);
    }
}
