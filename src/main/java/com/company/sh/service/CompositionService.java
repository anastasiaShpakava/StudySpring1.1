package com.company.sh.service;

import com.company.sh.model.Composition;
import com.company.sh.repository.CompositionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompositionService {
    private final CompositionRepository compositionRepository;

    public CompositionService(CompositionRepository compositionRepository) {
        this.compositionRepository = compositionRepository;
    }
    public List<Composition> getAllCompositions() {
        return  compositionRepository.findAll();
    }

    public Composition findComposition(Integer id) {
        return compositionRepository.findById(id).orElse(null);
    }

//    public Composition  findCompositionBySingerId(Integer id) {
//        return (Composition) compositionRepository.findBySingerId(id);
//    }
}
