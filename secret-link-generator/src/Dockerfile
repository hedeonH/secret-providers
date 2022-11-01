FROM amazoncorretto:11-alpine-jdk
COPY target/secret-link-generator-1.0.0.jar secret-link-generator.jar
ENTRYPOINT ["java","-jar","/secret-link-generator.jar"]