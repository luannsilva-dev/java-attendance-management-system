# Java Attendance Management System

A Java-based attendance management system developed during my internship at **IEFP (Instituto do Emprego e Formação Profissional)**.

The project was created based on **real attendance management needs identified within the training environment**, with the goal of providing a more organized and efficient way to manage students, training classes, instructors, lesson summaries, and attendance records.

The system was designed to provide **practical value to the team**, reducing manual work and centralizing attendance-related information in a structured system.

Although developed as part of my learning and professional development, the project was based on a **real organizational need observed during my internship**.


## Technologies

* Java
* Java Collections Framework
* `ArrayList`
* `LocalDate`
* `LocalTime`
* Enums
* Object-Oriented Programming

## Features

* Student management
* Training class management
* Instructor assignment
* Lesson/session management
* Attendance registration
* Attendance status management
* Attendance status updates
* Attendance statistics
* Student lookup by ID
* Lesson lookup by ID
* Duplicate prevention
* Input validation
* Relationship between classes using composition and association

## Attendance Status

The system supports three attendance states:

* `PRESENTE`
* `AUSENTE`
* `JUSTIFICADO`

## Main Domain Classes

```text
Aluno
 └── Student information

Formador
 └── Instructor information

Coordenador
 └── Classes under coordination

Turma
 ├── Alunos
 └── Sumarios

Sumario
 ├── Turma
 └── Presencas

Presenca
 ├── Aluno
 └── EstadoPresenca
```

## Object-Oriented Concepts Practiced

This project was developed to practice fundamental Java OOP concepts, including:

* Classes and objects
* Constructors
* Encapsulation
* Access modifiers
* Composition and association
* Object relationships
* Collections
* Enums
* Method return values
* Input validation
* Business rules
* Method responsibility
* Defensive copying of collections

## Business Rules

Some of the implemented rules include:

* A class cannot contain the same student twice.
* A class cannot contain the same lesson twice.
* A lesson cannot contain the same student's attendance twice.
* A student must belong to the class before attendance can be registered.
* Invalid or null objects are rejected.
* Attendance can be updated for an existing student.
* Attendance statistics can be calculated by status.

## Project Structure

```text
src/
├── Aluno.java
├── Coordenador.java
├── EstadoPresenca.java
├── Formador.java
├── Main.java
├── Presenca.java
├── Sumario.java
└── Turma.java
```

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA, Eclipse, or Visual Studio Code.
3. Make sure a compatible JDK is installed.
4. Run `Main.java`.

The current version runs as a console-based demonstration of the domain model and its business rules.

## Learning Goals

The main goal of this project is to strengthen my Java fundamentals through practical development and apply programming concepts to a real-world context.

The project focuses on learning how to:

* Translate requirements into classes and objects.
* Define responsibilities between classes.
* Work with Java Collections.
* Implement business rules.
* Validate object state.
* Protect internal collections through encapsulation.
* Debug and investigate problems during development.

## Future Improvements

Possible future iterations may include:

* Unit tests with JUnit
* Maven project structure
* Persistence with SQL
* JDBC integration
* REST API with Spring Boot
* Database integration
* Authentication and authorization

These features are intentionally outside the scope of the current version.

## Project Status

**Learning project — first OOP version completed.**

Developed during my internship at **IEFP**, as part of my practical progression toward becoming a Junior Java Developer.
