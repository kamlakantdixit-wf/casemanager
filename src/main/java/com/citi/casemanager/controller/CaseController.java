package com.citi.casemanager.controller;

import com.citi.casemanager.model.Case;
import com.citi.casemanager.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cases")
public class CaseController {
    @Autowired
    private CaseService caseService;

    @PostMapping("/create")
    public ResponseEntity<Case> createCase(@RequestBody Case caseDetails) {
        Case newCase = caseService.createCase(caseDetails);
        return ResponseEntity.ok(newCase);
    }

    @PostMapping("/{caseId}/move")
    public ResponseEntity<Case> moveCase(@PathVariable Long caseId, @RequestParam String decision) {
        Case updatedCase = caseService.moveCase(caseId, decision);
        return ResponseEntity.ok(updatedCase);
    }
}