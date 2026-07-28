# Spring AI Phase 2 – Chat Memory with MySQL (Persistent Conversations)

## 📌 Project Overview

This project demonstrates how to build an **AI-powered chatbot with persistent conversation memory** using **Spring AI 2.0.0**, **Spring Boot 4.1.0**, **Google Gemini**, and **MySQL**.

Unlike a basic chatbot that forgets previous conversations after every request, this application stores chat history in a MySQL database using Spring AI's **JdbcChatMemoryRepository**, allowing the AI to remember conversations even after the application is restarted.

This project is the **second phase** of my Spring AI learning roadmap.

---

## 🚀 Features

* 🤖 Google Gemini Integration
* 💬 ChatClient API
* 🧠 Chat Memory Support
* 📂 Persistent Memory using MySQL
* 💾 JdbcChatMemoryRepository
* 🪟 Message Window Chat Memory
* 🎯 MessageChatMemoryAdvisor
* 🔄 Automatic Chat History Storage
* 🔍 Conversation-based Memory using Conversation ID
* ⚡ Spring Boot 4.1.0
* 📦 Maven Project
* 🏗️ Layered Architecture
* 🌱 Official Spring AI Implementation

---

## 🛠️ Tech Stack

* Java 21
* Spring Boot 4.1.0
* Spring AI 2.0.0
* Google Gemini
* MySQL
* Spring Data JDBC
* Flyway
* Maven
* Lombok

---

## 📂 Project Structure

```text
src
├── main
│   ├── java
│   │   └── com.shabik.spring_ai_phase2
│   │       ├── config
│   │       ├── controller
│   │       ├── service
│   │       └── serviceimp
│   └── resources
│       ├── application.properties
│       └── db
│           └── migration
```

---

## 🏛️ Architecture

```text
Client (Postman)
        │
        ▼
ChatController
        │
        ▼
ChatService
        │
        ▼
ChatClient
        │
        ▼
MessageChatMemoryAdvisor
        │
        ▼
MessageWindowChatMemory
        │
        ▼
JdbcChatMemoryRepository
        │
        ▼
MySQL
        │
        ▼
Google Gemini
```

---

## 🧠 Chat Memory Flow

```text
User Message
      │
      ▼
Conversation ID
      │
      ▼
Advisor Loads Previous Messages
      │
      ▼
Gemini Generates Response
      │
      ▼
User & Assistant Messages Stored
      │
      ▼
MySQL Database
```

---

## 📚 Concepts Covered

* Spring AI ChatClient
* Chat Memory
* MessageChatMemoryAdvisor
* MessageWindowChatMemory
* JdbcChatMemoryRepository
* Conversation ID
* Persistent AI Memory
* Bean Configuration
* Dependency Injection
* Layered Architecture
* Official Spring AI Schema Initialization

---

## 🗄️ Database

The project uses **Spring AI's official JDBC chat memory schema**.

Spring AI automatically creates the required chat memory table when configured appropriately, ensuring compatibility with the framework.

---

## 🧪 API

### Chat Endpoint

```
GET /chat
```

### Request Parameters

| Parameter      | Description                          |
| -------------- | ------------------------------------ |
| conversationId | Unique identifier for a conversation |
| message        | User message                         |

### Example

```
GET /chat?conversationId=user1&message=My name is Shabik
```

Next Request

```
GET /chat?conversationId=user1&message=What is my name?
```

Expected Response

```
Your name is Shabik.
```

---


## ▶️ Getting Started

### Clone the Repository

```bash
git clone <your-repository-url>
```

### Configure Environment

Update your `application.properties` with:

* Google Gemini API Key
* MySQL Database URL
* Username
* Password

### Run the Application

```bash
mvn spring-boot:run
```




---

## 🤝 Connect With Me

If you found this project useful or have suggestions for improvement, feel free to connect or contribute.

⭐ If you like this project, consider giving it a **Star** on GitHub!

---

**Built with ❤️ using Spring AI, Spring Boot, Google Gemini, and MySQL.**

You can also add badges (Java, Spring Boot, Spring AI, Maven, MySQL, GitHub Stars, License, etc.) or screenshots later to make the repository look even more professional.
