<h3><b>🌱 What is Spring Boot?</b></h3><br>
Spring Boot is a Java framework used to build standalone web applications and APIs very quickly.<br>
It is built on top of the Spring Framework, but it makes development much easier.<br>
<h3><b>🚀 Why use Spring Boot?</b></h3><br>
1.Less Configuration → No need to write long XML files.<br>
2.Embedded Server → Comes with Tomcat, Jetty, etc. → no need to deploy WAR manually.<br>
3.Production Ready → Built-in security, logging, metrics, error handling.<br>
4.Spring Boot Starter → Ready-made dependencies for web, data, security, etc.<br>
5.Easy Database Connection → With Spring Data JPA, you can work with databases easily.<br>
<h3><b>⚡ How to Create a Spring Boot Project?</b></h3><br>
Go to 👉 Spring Initializr<br>
Select:<br>
Project: Maven.<br>
Language: Java.<br>
Spring Boot Version.<br>
Dependencies: Spring Web, Spring Data JPA, MySQL Driver (for example).<br>
Download project → Import in Eclipse/IntelliJ.<br>
<h3><b>👉 Run the project → Open browser → http://localhost:8080/hello</b></h3><br>
<h3><b>🔑 Key Points</b></h3><br>
@SpringBootApplication → main entry point<br>
@RestController → makes REST APIs<br>
@GetMapping, @PostMapping → handle HTTP requests<br>
application.properties → configuration (like DB connection, port, etc.)<br>
