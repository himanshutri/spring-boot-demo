FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-demo spring-boot-demo.jar
ENTRYPOINT ["java","-jar","/spring-boot-demo.jar"]