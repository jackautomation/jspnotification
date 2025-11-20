# Stage 1: Build
FROM maven:3.9.6-eclipse-temurin-17 AS builder

WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Run
FROM eclipse-temurin:17-jre

WORKDIR /app
COPY --from=builder /app/target/*.jar notification-service.jar

EXPOSE 8287
ENTRYPOINT ["java", "-jar", "notification-service.jar"]
