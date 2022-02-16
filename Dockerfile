FROM openjdk:8
EXPOSE 9090
ADD target/dockerdemo.jar dockerdemo.jar
ENTRYPOINT ["java", "-jar", "dockerdemo.jar"]