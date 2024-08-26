FROM openjdk:22-slim

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]