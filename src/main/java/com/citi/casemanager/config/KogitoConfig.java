package com.citi.casemanager.config;

import org.kie.kogito.process.Process;
import org.kie.kogito.process.Processes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KogitoConfig {

    private final Processes processes;

    // Constructor injection for Processes
    public KogitoConfig(Processes processes) {
        this.processes = processes;
    }

    // Define a bean for your specific process
    @Bean
    public Process<?> caseProcess() {
        // Replace "case-management-process" with the exact ID of your BPMN process
        return processes.processById("case_management");
    }
}

