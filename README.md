# project_tech
Tech_Eazy Project

## Spring Boot Student Management Application

This is a basic Spring Boot application that demonstrates CRUD operations for students and subjects, with security and JWT-based authentication.

### Technologies Used

- Spring Boot
- Spring MVC
- Spring Data JPA
- H2 Database (In-Memory)

### Project Setup

1. Clone the Repository:
   ```bash
   git clone https://github.com/Vanshcodes1/project_tech.git
   
2. Navigate to the Project Directory:
    cd <your-project-directory>

3.Build the Project:
 mvn clean install

4.Run the Application:
 mvn spring-boot:run

API Endpoints


Students:

POST /api/students: Create a new student.
GET /api/students: Get a list of all students.


Subjects:

POST /api/subjects: Create a new subject.
GET /api/subjects: Get a list of all subjects.

Database
H2 (In-Memory): The project uses an in-memory database for development simplicity.
Running the Project
Build the project with Maven.
Run the application with the command mvn spring-boot:run.
Access the API endpoints using your favorite REST client (e.g., Postman).


Important Notes
Make sure you have Java 19 or later installed.
The database credentials are configured in the 
 file.

I am Working on adding jwt authentication in the peoject
