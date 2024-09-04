# Case Management System

This project is a Case Management System built using Spring Boot, Kogito, and jBPM workflow. The system handles case creation, review, and decision-making across multiple levels of operational roles.

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher
- Git (if cloning from a repository)

## Project Structure

- **src/main/java**: Contains Java source code.
- **src/main/resources**: Contains BPMN files, application configuration, and other resources.
- **pom.xml**: Maven build configuration file.

## Setup

1. **Clone the Repository**:

   ```bash
   git clone <repository-url>
   cd <project-directory>

# build command
mvn clean install package -Dskiptests

# run project
mvn spring-boot:run

