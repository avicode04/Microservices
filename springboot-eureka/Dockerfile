FROM openjdk:11
ADD ./target/springboot-eureka-0.0.1-SNAPSHOT.jar-0.0.1-SNAPSHOT.jar /usr/src/eureka-0.0.1-SNAPSHOT.jar
WORKDIR usr/src

ENTRYPOINT ["java","-jar", "eureka-0.0.1-SNAPSHOT.jar"]
