FROM gradle:jdk17 as build
WORKDIR /app
COPY /build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]