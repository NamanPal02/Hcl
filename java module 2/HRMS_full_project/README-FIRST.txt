ABES HRMS FULL PROJECT

You have two folders:
1) hrmsdatabase - Spring Boot backend
2) hrmsfrontend - React/Vite frontend

START BACKEND FIRST:
- Open hrmsdatabase in IntelliJ as a Maven project.
- Edit src/main/resources/application.properties and set spring.datasource.password to your MySQL password.
- Ensure MySQL is running. Run HrmsdatabaseApplication.

THEN FRONTEND:
- Open a terminal in hrmsfrontend.
- Run: npm install
- Run: npm run dev
- Open http://localhost:5173

IMPORTANT:
- I corrected clear compile/runtime problems from the uploaded source and made the frontend call the backend API.
- I cannot verify your local MySQL password or run against your own MySQL server from here, so set your password and test locally.
- Employee verification compares the saved employee ID and email; it is not an email OTP.
