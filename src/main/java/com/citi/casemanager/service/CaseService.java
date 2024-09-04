package com.citi.casemanager.service;

import com.citi.casemanager.model.Case;
import com.citi.casemanager.repository.CaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CaseService {

    @Autowired
    private CaseRepository caseRepository;

    @Autowired
    private CaseProcessService caseProcessService;

    public Case createCase(Case caseDetails) {
        // Save the case in the database
        Case savedCase = caseRepository.save(caseDetails);
        // Start the BPMN process for the case
        return caseProcessService.startCaseProcess(savedCase);
    }

    public Case moveCase(Long caseId, String decision) {
        Optional<Case> optionalCase = caseRepository.findById(caseId);
        if (optionalCase.isPresent()) {
            // Update the case using the process management service
            return caseProcessService.moveCaseProcess(caseId, decision);
        }
        throw new RuntimeException("Case not found");
    }
}

