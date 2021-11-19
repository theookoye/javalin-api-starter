FROM adoptopenjdk:11-jre-hotspot-focal

WORKDIR /app
EXPOSE 8001
COPY build/libs/*.jar app.jar
CMD ["java", "-jar", "app.jar"]
