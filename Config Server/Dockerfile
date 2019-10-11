FROM openjdk:11
ADD ./target/microservices-demo-0.0.1-SNAPSHOT.jar-0.0.1-SNAPSHOT.jar /usr/src/config-server-0.0.1-SNAPSHOT.jar
WORKDIR usr/src

ENTRYPOINT ["java","-jar", "config-server-0.0.1-SNAPSHOT.jar"]
