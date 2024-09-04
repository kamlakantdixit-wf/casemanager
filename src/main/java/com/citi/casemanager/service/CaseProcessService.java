package com.citi.casemanager.service;

import com.citi.casemanager.model.Case;
import org.kie.kogito.process.Process;
import org.kie.kogito.process.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaseProcessService {

    @Autowired
    private Process<Case> caseProcess;

    public Case startCaseProcess(Case caseDetails) {
        // Start a new process instance with the provided case details
        ProcessInstance<Case> processInstance = caseProcess.createInstance(caseDetails);
        processInstance.start();
        if (processInstance.status() == ProcessInstance.STATE_ACTIVE) {
            System.out.println("Process started successfully for case ID: " + caseDetails.getCaseId());
        }
        return caseDetails;
    }

    public Case moveCaseProcess(Long caseId, String decision) {
        // Here you would fetch the process instance related to the given case ID
        // Make the required decision on the process and update the case status accordingly
        // Example:
        // ProcessInstance<Case> processInstance = caseProcess.instances().findById(caseId);
        // Implement logic to proceed with the decision (e.g., complete the task, signal the process)
        // Update case status or perform any business logic as needed

        // Simulate updating the process with decision logic
        System.out.println("Moving process for case ID: " + caseId + " with decision: " + decision);

        // Example placeholder logic - this should be replaced with actual process handling logic
        Case caseObj = new Case();
        caseObj.setCaseId(caseId.toString());
        caseObj.setStatus("Updated based on decision: " + decision);

        return caseObj;
    }
}
