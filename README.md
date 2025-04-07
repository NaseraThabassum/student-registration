# Student Registration System
This project is a **Full Stack Student Registration System** built with **React (Frontend)** and **Spring Boot (Backend)**. It allows users to register students by submitting their Name, Email, and Course, and displays a list of all registered students.
## 🧩 Project Structure
student-registration-system/
├── frontend/            # React JS Application
├── backend/             # Spring Boot Application
# 📦 Frontend (React)
### 🛠 Tech Stack
- React JS
- CSS
- Fetch API
### 🚀 Setup & Run
cd frontend
npm install
npm start
Visit: [http://localhost:3000](http://localhost:3000)
# 🔙 Backend (Spring Boot)
### 🛠 Tech Stack
- Java
- Spring Boot
- Spring Web
- Cross-Origin Resource Sharing (CORS)
### 🚀 Setup & Run
cd backend
./mvnw spring-boot:run
Backend will run at: [http://localhost:8080](http://localhost:8080)
### 🧪 API Endpoints
- `POST /api/students` - Register a student
- `GET /api/students` - Get all registered students
## 📌 Features
- Form validation with error messages
- Dynamic list of registered students
- Real-time update after registration
## 🔐 CORS Configuration
`@CrossOrigin(origins = "http://localhost:3000")` is used in the controller to allow frontend access.
