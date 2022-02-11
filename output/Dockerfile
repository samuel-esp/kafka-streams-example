FROM openjdk:11-jdk

ADD target/output-0.0.1-SNAPSHOT.jar output-0.0.1-SNAPSHOT.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "output-0.0.1-SNAPSHOT.jar"]

HEALTHCHECK --start-period=30s --interval=10s CMD curl -f http://localhost:8081/actuator/health || exit 1