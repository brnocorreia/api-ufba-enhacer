package br.com.brnocorreia.apiufbaenhacer.domain.dto;

import br.com.brnocorreia.apiufbaenhacer.domain.entities.Discipline;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DisciplineResponse {
    private Integer disciplineId;
    private String code;
    private String name;
    private Integer workload;
    private String department;
    private String program;
    private String objective;
    private String content;
    private String bibliography;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static DisciplineResponse from(Discipline discipline) {
        return new DisciplineResponse(
                discipline.getDisciplineId(),
                discipline.getCode(),
                discipline.getName(),
                discipline.getWorkload(),
                discipline.getDepartment(),
                discipline.getProgram(),
                discipline.getObjective(),
                discipline.getContent(),
                discipline.getBibliography(),
                discipline.getCreatedAt(),
                discipline.getUpdatedAt()
        );
    }
}
