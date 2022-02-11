FROM openjdk:11-jdk

ADD target/processor-0.0.1-SNAPSHOT.jar processor-0.0.1-SNAPSHOT.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "processor-0.0.1-SNAPSHOT.jar"]

HEALTHCHECK --start-period=30s --interval=10s CMD curl -f http://localhost:8082/actuator/health || exit 1