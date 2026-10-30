ABES HRMS - Login feature added

DEMO LOGIN
Email: admin@abes.ac.in
Password: Admin@123

HOW TO RUN
1. Start MySQL and confirm hrmsdatabase/src/main/resources/application.properties has your correct MySQL username/password.
2. Open hrmsdatabase in IntelliJ and run HrmsdatabaseApplication. On first start, app_users table and the demo admin account are created automatically.
3. Open a terminal in hrmsfrontend and run: npm install (only if needed), then npm run dev.
4. Open the Vite URL, normally http://localhost:5173, and sign in using the demo credentials above.

The password is stored as a BCrypt hash in MySQL, not plain text. This is a learning/demo login and does not yet protect every backend API endpoint with Spring Security. Do not expose this application publicly or use the default password for real employee data. Change/remove the demo credentials before real use.
