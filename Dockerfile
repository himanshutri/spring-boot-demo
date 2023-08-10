FROM openjdk:8
EXPOSE 8080
ADD C:\Users\asus\AppData\Local\Jenkins\.jenkins\workspace\spring boot pipeline\target\spring-boot-demo spring-boot-demo.jar
ENTRYPOINT ["java","-jar","/spring-boot-demo.jar"]
