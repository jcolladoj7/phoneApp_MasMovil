FROM openjdk:8-jdk-slim
ADD target/phoneApp-0.0.1-SNAPSHOT.jar /usr/share/masmovil.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/share/masmovil.jar"] 