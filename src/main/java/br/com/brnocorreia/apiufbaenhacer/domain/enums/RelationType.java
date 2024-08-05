package br.com.brnocorreia.apiufbaenhacer.domain.enums;

import jakarta.persistence.AttributeConverter;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor
public enum RelationType implements Serializable {

    OBLIGATORY("OB"),
    OPTIONAL("OP"),
    UNKNOWN("UK");

    private String code;

    public static class Converter implements AttributeConverter<RelationType, String> {

        @Override
        public String convertToDatabaseColumn(RelationType attribute) {
            return attribute.getCode();
        }

        @Override
        public RelationType convertToEntityAttribute(String dbData) {
            return RelationType.valueOf(dbData);
        }
    }

    public String toString() {
        return code;
    }

    public static RelationType getType(String code) {
        for (RelationType type : RelationType.values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }
        return RelationType.UNKNOWN;
    }

}
