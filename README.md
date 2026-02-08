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


    The project follows a layered architecture:
    
      Controller → Service → Repository → Database

      
      •Controller handles HTTP requests
      •Service contains business logic
      •Repository handles JDBC database operations
      •Database stores fitness data
      
    Architecture diagram is included as a UML/PlantUML image in the project.

    
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
