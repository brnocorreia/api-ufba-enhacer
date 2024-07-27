package br.com.brnocorreia.apiufbaenhacer.domain.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CoursePayload {
    private String code;
    private String name;
    private String shift;
    private Integer minDuration;
    private Integer maxDuration;
    private String legalBase;
    private String description;
    private Integer obWorkload;
    private Integer opWorkload;
    private Integer acWorkload;
}
