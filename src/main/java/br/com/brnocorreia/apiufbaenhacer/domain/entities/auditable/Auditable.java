package br.com.brnocorreia.apiufbaenhacer.domain.entities.auditable;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
public abstract class Auditable implements Serializable {
    @Column(name = "created_at", updatable = false)
    Date createdAt;

    @Column(name = "updated_at")
    Date updatedAt;
}
