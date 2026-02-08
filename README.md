  README 

•A. Project Overview

    •Fitness Tracker is a Spring Boot RESTful API developed as an endterm project
    •The system allows users to track fitness activities such as workouts, calories burned, duration, and activity types
    
    The project demonstrates:
    
      • REST API development with Spring Boot
      • Clean layered architecture
      • Application of Design Patterns
      • Usage of SOLID principles
      • Proper separation of components
      • JDBC-based database access
      • Exception handling and validation

•B. REST API Documentation

    •Base URL:
    
      http://localhost:8080

    
    •Endpoints List

    
    • /api/activities	        GET	      Get all fitness activities
    • /api/activities/{id}	  GET	      Get activity by ID
    • /api/activities	        POST	    Create new activity
    • /api/activities/{id}  	PUT	      Update activity
    • /api/activities/{id}	  DELETE	  Delete activity
    • /health	                GET	      Health check

    
    •Sample JSON Requests / Responses
    
      •Create Activity — POST /api/activities
      
          {
            "userId": 1,
            "activityType": "RUNNING",
            "durationMinutes": 45,
            "caloriesBurned": 350
          }
          
      •Response
      
          {
            "id": 10,
            "userId": 1,
            "activityType": "RUNNING",
            "durationMinutes": 45,
            "caloriesBurned": 350
          }
          
      •Get All Activities — GET /api/activities
      
          [
            {
              "id": 1,
              "userId": 1,
              "activityType": "WALKING",
              "durationMinutes": 30,
              "caloriesBurned": 120
            }
        ]

        
    •Postman Screenshots
    
<img width="2940" height="1912" alt="9AFFEB53-39B1-4AFF-9576-12B8939B07E8" src="https://github.com/user-attachments/assets/ac38e7e8-d36a-4281-8903-873f217b9717" />

<img width="2940" height="1912" alt="F7CD9F53-E4E9-410B-A3B4-FE303DFA68DD" src="https://github.com/user-attachments/assets/ceb1a6b7-7907-4d48-981a-70c0c16fbd04" />

<img width="2940" height="1912" alt="75A04A6D-29F5-4B78-AFBB-7214825FAC84" src="https://github.com/user-attachments/assets/ff427eb6-31d2-4f8e-9725-03b14e40d18f" />

<img width="2940" height="1912" alt="2E2BAB43-0243-42E3-9E43-2BA2AE31A31F" src="https://github.com/user-attachments/assets/61eafe68-bcf3-41fd-bd62-e160b01c1f81" />

<img width="2940" height="1912" alt="8929881F-7A49-4C05-AF5F-204A83F6E693" src="https://github.com/user-attachments/assets/41c63819-05e9-4f57-8c94-749321752720" />


    
•C. Design Patterns


    •Singleton Pattern
    
      Purpose:
        Ensures that only one instance of the database connection or configuration class exists.
      
      Usage:
        Used for database connection management to prevent multiple unnecessary connections.
        
    •Factory Pattern
    
      Purpose:
        Encapsulates object creation logic and provides loose coupling.
        
      Usage:
        Used to create different types of fitness activities (e.g., Running, Walking, Cycling) without exposing creation logic to the controller.
        
    •Builder Pattern
    
      Purpose:
        Helps construct complex objects step-by-step.
        
      Usage:
        Used to create FitnessActivity objects with multiple fields in a clean and readable way.
        
•D. Component Principles

    The project follows key Component Principles:
    
      •REP (Reuse/Release Equivalence Principle):
        Classes that change together are packaged together.
      •CCP (Common Closure Principle):
        Related functionality is grouped into the same package.
      •CRP (Common Reuse Principle):
        Avoids unnecessary dependencies between unrelated components.
        
      •Packages are clearly separated into:
      
        •controller
        •service
        •repository
        •model
        •exception

        
•E. SOLID & OOP Summary


    •The project follows all SOLID principles:
    
      •S — Single Responsibility:
        Each class has one responsibility.
      •O — Open/Closed:
        New activity types can be added without modifying existing logic.
      •L — Liskov Substitution:
        Activity subclasses can replace parent types safely.
      •I — Interface Segregation:
        Interfaces are small and specific.
      •D — Dependency Inversion:
        Services depend on interfaces, not concrete implementations.
        
    •OOP concepts used:
    
      •Encapsulation
      •Abstraction
      •Inheritance
      •Polymorphism

      
•F. Database Schema


    •Table: fitness_activities
    
      Column	             Type
      id	                 BIGINT (PK)
      user_id	             BIGINT
      activity_type	       VARCHAR
      duration_minutes	   INTEGER
      calories_burned	     INTEGER

      
      PostgreSQL is used as the relational database.

      
•G. System Architecture Diagram


    The diagram illustrates the layered architecture of the Fitness Tracker
    Spring Boot REST API.

      The application is structured as follows:

        •Client (Postman / Browser) 
        Sends HTTP requests to the REST API.

        •Controller Layer (`WorkoutController`) 
        Handles incoming HTTP requests, maps endpoints, and returns responses.

        •Service Layer (`WorkoutService`)
        Contains the business logic and coordinates application workflows.

        •Repository Layer (`WorkoutRepository`)
        Manages data access using JDBC and communicates with the database.

        •Database (PostgreSQL)
        Stores fitness workout data.

    Additional architectural components:

      •Global Exception Handling
        Implemented using `GlobalExceptionHandler` and custom exceptions
        such as `WorkoutNotFoundException`.

      •Design Patterns Integration
        The system applies Factory, Builder, and Singleton patterns
        to ensure clean object creation and configuration.

      The architecture follows the classic layered design pattern,
      promoting separation of concerns, maintainability, and scalability.

   <img width="1376" height="1316" alt="062D6656-2FAF-4707-ADC3-170DD58096E9" src="https://github.com/user-attachments/assets/d460d654-0316-47b5-b8aa-3a4869a0d4bb" />

    
    
•H. Instructions to Run the Spring Boot Application


    •Prerequisites:
    
      •Java 17+
      •PostgreSQL
      •Gradle
      •Postman
      
    •Steps:
    
      •Clone the repository
      •Create PostgreSQL database
      •Update application.properties
      
    •API will be available at:
    
      http://localhost:8080

      
•I. Reflection


    •This project helped me understand how to:
    
      •Design a real REST API using Spring Boot
      •Apply design patterns in practice
      •Structure a backend project professionally
      •Use SOLID principles in real code
      •Work with JDBC and PostgreSQL
      •Document APIs clearly using README and Postman
      
    Overall, this project improved my backend development skills and understanding of clean architecture.
