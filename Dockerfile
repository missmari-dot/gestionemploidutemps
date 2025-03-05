FROM ubuntu:latest
LABEL authors="HP"

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["top", "-b", "java", "-jar","/app.jar"]
