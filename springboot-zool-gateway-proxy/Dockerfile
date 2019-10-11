FROM openjdk:11
ADD ./target/springboot-zool-gateway-proxy-0.0.1-SNAPSHOT.jar /usr/src/api-gateway-0.0.1-SNAPSHOT.jar
WORKDIR usr/src

ENTRYPOINT ["java","-jar", "api-gateway-0.0.1-SNAPSHOT.jar"]