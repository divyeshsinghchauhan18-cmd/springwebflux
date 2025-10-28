# 🌸 Spring BackFlux (Spring Boot + WebFlux)

A reactive backend application built using *Spring Boot* and *Spring WebFlux*.  
It demonstrates non-blocking, asynchronous programming using the *Reactive Streams* API with *Mono* and *Flux*.

---

## 🚀 Features
- Reactive REST APIs using *Spring WebFlux*
- Uses *Mono* and *Flux* for async, non-blocking streams
- Integrated with *Reactor* for reactive programming
- Supports *functional endpoints* or *annotated controllers*
- Ready for *Reactive MongoDB / R2DBC / PostgreSQL*
- Exception handling and validation included

---

## ⚙ Tech Stack
- *Java 17+*
- *Spring Boot 3+*
- *Spring WebFlux*
- *Project Reactor*
- *Lombok*
- *Gradle* or *Maven* build tool

---

## 🧩 Project Structure

src/ ├── main/ │   ├── java/com/example/backflux/ │   │   ├── controller/     # REST Controllers │   │   ├── service/        # Business Logic │   │   ├── repository/     # Reactive Data Layer │   │   └── model/          # Entity/DTO Classes │   └── resources/ │       └── application.yml # Configuration └── test/                   # Unit Tests

---

## ▶ Run the Application
### Using Maven
```bash
mvn spring-boot:run

Using Gradle

./gradlew bootRun

Then visit:
👉 http://localhost:8080


---

🧠 Example Reactive Endpoint

@GetMapping("/users")
public Flux<User> getAllUsers() {
    return userService.getAllUsers();
}


---

🧰 Example API Test

curl http://localhost:8080/users

Response:

[
  { "id": 1, "name": "John Doe" },
  { "id": 2, "name": "Jane Doe" }
]


---

📘 Learn More

Spring WebFlux Docs

Project Reactor

Spring Boot Reference



---

Author: Divyesh Singh Chauhan
License: MIT

---

Would you like me to make this README specifically for *Spring WebFlux with MongoDB* or *PostgreSQL (R2DBC)*?
