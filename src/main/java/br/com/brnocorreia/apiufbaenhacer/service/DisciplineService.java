package br.com.brnocorreia.apiufbaenhacer.service;

import br.com.brnocorreia.apiufbaenhacer.dao.DisciplineRepository;
import br.com.brnocorreia.apiufbaenhacer.domain.dto.DisciplinePayload;
import br.com.brnocorreia.apiufbaenhacer.domain.dto.DisciplineResponse;
import br.com.brnocorreia.apiufbaenhacer.domain.entities.Discipline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplineService {

    @Autowired
    private DisciplineRepository disciplineRepository;

    public ResponseEntity<Discipline> create(DisciplinePayload payload) {

        // TODO: Create error response
        if (disciplineRepository.existsByCode(payload.getCode())) {
            return ResponseEntity.badRequest().build();
        }

        Discipline discipline = Discipline.from(payload);
        disciplineRepository.save(discipline);

        return ResponseEntity.ok().body(discipline);
    }

    public ResponseEntity<List<DisciplineResponse>> getAll() {

        List<Discipline> disciplines = disciplineRepository.findAll();
        List<DisciplineResponse> disciplineResponses = disciplines.stream().map(DisciplineResponse::from).toList();

        return ResponseEntity.ok(disciplineResponses);
    }

    public ResponseEntity<DisciplineResponse> getByCode(String code) {
        Discipline discipline = disciplineRepository.findByCode(code);

        return ResponseEntity.ok(DisciplineResponse.from(discipline));
    }
}
