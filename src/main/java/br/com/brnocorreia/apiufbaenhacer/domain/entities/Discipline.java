package br.com.brnocorreia.apiufbaenhacer.domain.entities;

import br.com.brnocorreia.apiufbaenhacer.dao.base.AuditableFields;
import br.com.brnocorreia.apiufbaenhacer.domain.dto.DisciplinePayload;
import br.com.brnocorreia.apiufbaenhacer.domain.entities.auditable.Auditable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "disciplines")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditableFields.class)
public class Discipline extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer disciplineId;

    @Column(name = "code", nullable = false, unique = true)
    private String code;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "workload", nullable = false)
    private Integer workload;

    @Column(name = "department", nullable = false)
    private String department;

    @Column(name = "program")
    private String program;

    @Column(name = "objective")
    private String objective;

    @Column(name = "content")
    private String content;

    @Column(name = "bibliography")
    private String bibliography;

    public Discipline(final DisciplinePayload payload) {
        this.code = payload.getCode();
        this.name = payload.getName();
        this.workload = payload.getWorkload();
        this.department = payload.getDepartment();
        this.program = payload.getProgram();
        this.objective = payload.getObjective();
        this.content = payload.getContent();
        this.bibliography = payload.getBibliography();
    }

    public static Discipline from(DisciplinePayload payload) {
        return new Discipline(payload);
    }
}
