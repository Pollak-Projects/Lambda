FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD

COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/
RUN mvn clean install
RUN mvn package

FROM openjdk:8-jre-alpine

WORKDIR /app

COPY --from=MAVEN_BUILD /build/target/hu-szakkor-forum-0.1.0.jar /app/

ENTRYPOINT ["java", "-jar", "hu-szakkor-forum-0.1.0.jar"]