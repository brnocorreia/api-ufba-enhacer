package br.com.brnocorreia.apiufbaenhacer.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RelationId implements Serializable {
    @Column(name = "course_id")
    private Integer courseId;

    @Column(name = "discipline_id")
    private Integer disciplineId;
}
