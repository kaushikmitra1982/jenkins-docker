FROM openjdk:8
ADD target/Employee.jar Employee.jar
EXPOSE 7000
ENTRYPOINT ["java","-jar","Employee.jar"]