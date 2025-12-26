## Kotlin Maven Template

This is a simple template for Kotlin projects using Maven as the build tool. It includes basic configurations for Kotlin development and testing with JUnit.

Prerequisites

Before you start, ensure that you have the following installed:

- Java 21 (or later)
- Maven (optional, since Maven Wrapper is included)

Getting Started

1. Clone this repository:

   git clone https://github.com/m1ad3n/kotlin-maven-template.git
   cd kotlin-maven-template

2. **Update the following values in the pom.xml:**
   - **`mainClass`**: Change this to the fully qualified name of your main class (e.g., `com.example.MainKt`).
   - **`projectName`**: Change the artifactId to your project’s name.
   - **`groupId`**: Update this to match your organization's or project's group ID.

2. Use Maven Wrapper to build and run the project:

   `./mvnw compile exec:java`

   For Windows, use mvnw.cmd instead of ./mvnw.

3. Run tests:

   `./mvnw test`

Configuration

The pom.xml file includes the necessary dependencies and configuration for building and testing Kotlin applications using Maven. The project uses:

- Kotlin version 2.1.0
- JUnit 5 for testing

You can customize the project by modifying the pom.xml file or adding new Kotlin source files in src/main/kotlin.
