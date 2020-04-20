package com.company.sh.repository;

import com.company.sh.model.Composition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompositionRepository extends JpaRepository <Composition, Integer> {
}
