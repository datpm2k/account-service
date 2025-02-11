FROM gradle:jdk17
WORKDIR /app
COPY /build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]