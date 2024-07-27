package br.com.brnocorreia.apiufbaenhacer.domain.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class DisciplinePayload {
    private String code;
    private String name;
    private Integer workload;
    private String department;
    private String program;
    private String objective;
    private String content;
    private String bibliography;
}
