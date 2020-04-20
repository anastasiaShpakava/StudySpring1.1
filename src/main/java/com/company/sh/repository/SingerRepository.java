package com.company.sh.repository;

import com.company.sh.model.Singer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SingerRepository extends JpaRepository <Singer, Integer> {
}
