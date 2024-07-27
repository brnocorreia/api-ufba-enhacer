package br.com.brnocorreia.apiufbaenhacer.dao.base;

import br.com.brnocorreia.apiufbaenhacer.domain.entities.auditable.Auditable;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.util.Date;

public class AuditableFields {

    @PreUpdate
    public void updateAuditableFields(final Auditable obj) {
        obj.setCreatedAt(new Date());
    }

    @PrePersist
    public void createAuditableFields(final Auditable obj) {
        obj.setCreatedAt(new Date());
        obj.setUpdatedAt(new Date());
    }
}
