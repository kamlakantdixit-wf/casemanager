package com.citi.casemanager.repository;

import com.citi.casemanager.model.Case;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseRepository extends JpaRepository<Case, Long> {
}
