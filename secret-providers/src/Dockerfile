FROM amazoncorretto:11-alpine-jdk
COPY target/secret-provider-1.0.0.jar secret-provider.jar
ENTRYPOINT ["java","-jar","/secret-provider.jar"]