package com.company.sh.repository;

import com.company.sh.model.Composition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CompositionRepository extends JpaRepository <Composition, Integer> {
    @Query("select s from Composition s where s.singer_id.id = ?")
    List<Composition> findBySingerId(Integer id);
}
