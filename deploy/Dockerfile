FROM openjdk:11-slim-buster
WORKDIR /user-app
COPY build/libs/user-service-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT ["java"]
CMD ["-jar", "user-service-0.0.1-SNAPSHOT.jar"]
