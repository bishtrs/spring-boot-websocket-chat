# Spring Boot Websocket Chat Application

## 1. Project Overview 

- A simple Spring Boot Websocket Chat Application
- Used WebSocket & STOMP for messaging.

## 2. Tech stack

- JDK 17  
- Maven 4.0  
- Spring Boot 3.3.0  
- Spring Websocket 6.1.8


## 3. Building and running the application

### 1) Clone the repo

git clone https://github.com/bishtrs/spring-boot-websocket-chat.git

### 2) Build the application

mvn clean package 

### 3) Run the application

mvn spring-boot:run<br/><br/>  

## 4. Access the application  

Open your browser and navigate to http://localhost:8080 (or the configured port).
Launch couple of chat windows, click on Join and then send some message. Note that message sent in one chat window
will be visible in other chat window.
<br/><br/>

<img width="386" alt="image" src="https://github.com/user-attachments/assets/a513df82-239c-4822-8fee-2479b7fbe298" />

<br/><br/>

<img width="390" alt="image" src="https://github.com/user-attachments/assets/d97b8def-115c-4d11-81a4-c1cb8baa5483" />






## 6. Code Explanation

ChatController uses @MessageMapping annotation which makes sure any message sent to /chat calls greeting method which sends it back to
/topic/chat subscribers.

app.js subscribes to /topic/chat destination & also sends the message.using STOMP client. 



