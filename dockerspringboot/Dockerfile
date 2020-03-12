FROM openjdk:8-jre-alpine
COPY target/dockerspringboot-0.0.1-SNAPSHOT.jar /usr/share
WORKDIR /usr/share
ENTRYPOINT ["java","-jar", "dockerspringboot-0.0.1-SNAPSHOT.jar"]