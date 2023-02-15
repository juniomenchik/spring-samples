FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
EXPOSE 8761/tcp
EXPOSE 8761/udp
ENTRYPOINT ["java","-jar","/app.jar"]