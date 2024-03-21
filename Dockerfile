FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package

FROM openjdk:17
EXPOSE 9003
COPY --from=build /target/table-service-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]