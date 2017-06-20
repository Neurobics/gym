FROM openjdk:jre-alpine

EXPOSE 4567

ADD target/dockerized-webapp-1.0-SNAPSHOT.jar /webapp.jar

ENTRYPOINT java -jar /webapp.jar "$name"

