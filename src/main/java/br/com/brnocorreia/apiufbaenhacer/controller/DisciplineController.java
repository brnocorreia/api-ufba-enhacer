package br.com.brnocorreia.apiufbaenhacer.controller;

import br.com.brnocorreia.apiufbaenhacer.domain.dto.DisciplinePayload;
import br.com.brnocorreia.apiufbaenhacer.domain.entities.Discipline;
import br.com.brnocorreia.apiufbaenhacer.service.DisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/disciplines")
public class DisciplineController {

    @Autowired
    private DisciplineService disciplineService;

    @PostMapping()
    public ResponseEntity<Discipline> createDiscipline(@RequestBody DisciplinePayload payload) {
        return disciplineService.create(payload);
    }
}
