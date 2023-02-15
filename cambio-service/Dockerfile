FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
EXPOSE 8000/tcp
EXPOSE 8000/udp
ENTRYPOINT ["java","-jar","/app.jar"]