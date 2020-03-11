FROM openjdk:8-jre-alpine
COPY target/generaldocker-0.0.1-SNAPSHOT.jar /usr/share
WORKDIR /usr/share
ENTRYPOINT ["java","-cp", "generaldocker-0.0.1-SNAPSHOT.jar", "mypackage.DaysOfTheWeek"]