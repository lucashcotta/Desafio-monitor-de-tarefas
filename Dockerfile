FROM openjdk:21-jdk-slim

WORKDIR /app

COPY target/Monitoramento_Tarefas-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/app.jar"]