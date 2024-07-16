FROM openjdk:17-alpine
WORKDIR /opt
EXPOSE 8080
COPY target/*.jar /opt/app.jar
ENTRYPOINT ["java", "-jar", "/opt/app.jar"]