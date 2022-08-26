FROM openjdk:11-jre-slim

EXPOSE 8080

RUN mkdir /app

COPY build/libs/product-catalog-ws-0.0.1-SNAPSHOT.jar /app/spring-boot-application.jar

ENTRYPOINT ["java","-Dspring.profiles.active=docker","-jar","/app/spring-boot-application.jar"]


#docker build -t juniomenchik/springwebapp-product-catalog:0.0.0 .