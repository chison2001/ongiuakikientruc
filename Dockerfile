FROM adoptopenjdk/openjdk11:alpine

WORKDIR /app

COPY target/ongiuaki3-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "/app/ongiuaki3-0.0.1-SNAPSHOT.jar"]