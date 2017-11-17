# Kotlin Microservice Demo 
Done so far:
- Created microservice  using Kotlin (100%), Spring Boot, Spring JPA
- Added Zuul Proxy
- Added Prefilter for zuul 
- Added Eureka Service Discovery
- Ribbon Loadbalancing

Future Plans:
- OAuth2 security
- More filters with zuul (or other zuul capabilities)
- Ribbon loadbalance [done]


Create each package with 

`mvn clean package`

Start with running Eureka Service Discovery:

`java -jar EurekaService-1.0-SNAPSHOT.jar`

Then start the gateway service:

`java -jar GatewayService-1.0-SNAPSHOT.jar`

You can start other services in any order as much as you want:

`java -jar EmployeeService-1.0-SNAPSHOT.jar
java -jar DepartmentService-1.0-SNAPSHOT.jar
`

When you want to run more than one instance, don't forget to set the port:

`java -jar -Dserver.port=9090 DepartmentService-1.0-SNAPSHOT.jar`

I should have done this using docker but it is a work in progress...

Cheers
