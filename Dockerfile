FROM openjdk:8
EXPOSE 7000
ADD target/employee.jar employee.jar
ENTRYPOINT ["java","-jar","/employee.jar"]