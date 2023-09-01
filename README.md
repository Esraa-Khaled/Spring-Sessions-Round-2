# spring-sessions

## Session#1

- What means Web Application.
- Web server Vs Application server.
- WAR Vs JAR.
- Bootstrapping spring application.
- Inversion Of Control.
- Dependency Injection Using:
	- 1- Java based configurations.
	- 2- Annotations.

**Annotations:**  ``@Component``, ``@ComponentScan``, ``@SpringBootApplication``, ``@Configuration``, ``@Bean``, ``@Autowired``
  
**Installations:**
- [java](https://www.codejava.net/java-se/download-and-install-java-11-openjdk-and-oracle-jdk)
- [Maven](https://phoenixnap.com/kb/install-maven-windows)
- [Building an Application with Spring Boot](https://spring.io/guides/gs/spring-boot)

**Links**
- [Web Server Concepts](https://www.youtube.com/watch?v=9J1nJOivdyw)
- [How a web application works](https://www.youtube.com/watch?v=zjfViRCjT5U)
- [Web server vs. Application server](https://www.educative.io/answers/web-server-vs-application-server),
- [Web server Vs Application server ](https://youtu.be/-XoXOp7Ihyc?list=PL0pSb9Km2KjLs6GA1KS20N2QEFpwFJEap&t=853)>> last 5  minutes in video
- [Dependency Injection](https://www.youtube.com/watch?v=eQ90v7HQT-Q)
- [What is difference between @Component and @Bean annotation in Spring?](https://medium.com/javarevisited/what-is-difference-between-component-and-bean-annotation-in-spring-bffdad0ab899)

**Refrences:**
- https://www.baeldung.com/java-jar-war-packaging
- https://docs.spring.io/spring-framework/docs/5.0.0.M1/spring-framework-reference/pdf/spring-framework-reference.pdf
- https://www.tutorialspoint.com/spring/index.htm
- https://www.javatpoint.com/spring-tutorial
- https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#legal

**If you just want to know how to code check this:**
- https://www.youtube.com/@amigoscode/playlists

**If you need to understand the behind reson of basics check those channels:**
  - https://www.youtube.com/@laurspilca/playlists
  - https://www.youtube.com/@SeleniumExpress/playlists
  - https://www.youtube.com/@Java.Brains/playlists?view=50&sort=dd&shelf_id=7

**Task:**
- What is the web service?
- Comparison between REST & SOAP.
- Search for Bean Scopes.
- Search for how to resolve the issue of dependency injection for multiple interface implementations using @Autowired.

  ____

## Session#2

- web service (Rest & Soap) >> Rest Methods
- Difference between N layer & N Tier Architecture
- Consume Rest APIs (signIn)
- Postman
- Connect to database using JdbcTemplate
- maven (generate runnable jar / generate documentation)
- override system properties

**Annotations:** ``@Controller``, ``@ResponseBody``, ``@RestController``, ``@RequestMethod``, ``@PathVariable``, ``@RequestParam``, ``@RequestHeader``, ``@GetMapping``, ``@PostMapping``, ``@Qualifier``

-[DatabaseConnection](https://docs.oracle.com/cd/E19509-01/820-3497/agqka/index.html)

**Installation:**
- [postgres](https://www.postgresql.org/download/)
- [pgadmin](https://www.pgadmin.org/download/)
- [postman](https://www.postman.com/downloads/)

___

## Session#3

- ORM
- Hibernate
- Table & Columns generation
- ID generation strategies

**Annotations:** ``@Entity``, ``@Table``, `` @Id``, ``@GeneratedValue``, ``@SequenceGenerator``, ``@TableGenerator``, ``@Column``, ``@ColumnDefault``, ``@Transient``, ``@Type``, ``@Lob``

**Refrence:** 
-[Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query.other-methods)

___

## Session#4

- Entity Relation Diagram
- JPA Relations

**Refrences:**
- [Entity Relationship Diagram](https://youtu.be/CZ46r29kyQw)
- [Hibernate/JPA One-to-Many Mappings](https://howtodoinjava.com/hibernate/hibernate-one-to-many-mapping/)
- [Jackson – Bidirectional Relationships](https://www.baeldung.com/jackson-bidirectional-relationships-and-infinite-recursion)
- [Jackson Exceptions – Problems and Solutions](https://www.baeldung.com/jackson-exception)

**Annotations:** ``@OneToMany``, ``@ManyToOne``, ``@JoinColumn``, ``@JsonManagedReference``, ``@JsonBackReference``, ``@JsonIgnore``

  ____
  
## Session#5

- JPA Casede Opertions & Fetching Types
- Response Entity
- Global Exception Handeler

**Refrences:**
- [JPA Cascading Operations](https://www.javatpoint.com/jpa-cascading-operations)
- [JPA FetchTypes](https://thorben-janssen.com/entity-mappings-introduction-jpa-fetchtypes/)
- [Hibernate Fetch Type: Lazy or Eager?](https://medium.com/javarevisited/hibernate-a-silver-bullet-for-java-persistence-part-2-d803d653b591)
- [Response Entity](https://www.baeldung.com/spring-response-entity)
- [Spring Boot - Exception Handling](https://www.tutorialspoint.com/spring_boot/spring_boot_exception_handling.htm)
- [Understanding Spring’s @ControllerAdvice](https://medium.com/@jovannypcg/understanding-springs-controlleradvice-cd96a364033f)

**Annotations:**  ``@OneToOne`` , ``@ControllerAdvice``, ``@ExceptionHandler``

**Task:** 
- Implemet ERD(Entity Relation Diagram) For your system.
- Search for swagger & Implment it on your project
  
## Session#6

- Spring AOP

**Links:**
- [Spring AOP Tutorial](https://www.youtube.com/playlist?list=PLE37064DE302862F8)
 
**Annotations:** ``@EnableAspectJAutoProxy``, ``@Aspect``, ``@Order``, ``@Before``, ``@After``, ``@AfterReturning`` ,``@AfterThrowing``, ``@Around``, ``@Pointcut``

**Task**:
- Search for MDC (Mapped Diagnostic Context)

## Session#7

- Spring Security using JWT

**Links:**
- [JWT.io](https://jwt.io/)
- [Spring Boot - Spring Security + JWT]([https://www.youtube.com/watch?v=rBNOc4ymd1E](https://youtube.com/playlist?list=PLqq-6Pq4lTTYTEooakHchTGglSvkZAjnE&si=VbSOB6PnEOr_rLyR))

**Task:** 
- Apply security to your project
___

## Session#8

- Many-To-Many Relationship in JPA (User&Roles)
- Spring Security Basics

**Links:**
- [Spring Security Basics](https://www.baeldung.com/spring-security-method-security)

**Annotations:** ``@ManyToMany``, ``@JoinTable``, ``@EnableWebSecurity``


## Session#9

- Caching using Redis (Remote Dictionary Server)

**Links:**
- [Spring Data Redis as Cache](https://www.youtube.com/watch?v=AiNL1X-dhkc)
- [The Guide to RestTemplate](https://www.baeldung.com/rest-template)
- [Spring 5 WebClient](https://www.baeldung.com/spring-5-webclient)
 
**Annotations:** ``@EnableCaching``, ``@Cacheable``, ``@CacheEvict``
