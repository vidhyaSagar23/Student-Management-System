FROM maven:3.8.3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17-ea-28-jdk-slim
COPY --from=build target/Student_Management-0.0.1-SNAPSHOT.jar Student_Management.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "Student_Management.jar"]
