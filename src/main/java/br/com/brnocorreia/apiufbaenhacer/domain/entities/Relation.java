package br.com.brnocorreia.apiufbaenhacer.domain.entities;

import br.com.brnocorreia.apiufbaenhacer.domain.enums.RelationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "relations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Relation {

    @EmbeddedId
    private RelationId id;

    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne
    @MapsId("disciplineId")
    @JoinColumn(name = "discipline_id")
    private Discipline discipline;

    @Column(name = "relation_type")
    @Convert(converter = RelationType.Converter.class)
    private RelationType relationType;
}
