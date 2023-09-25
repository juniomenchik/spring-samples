FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app.jar
EXPOSE 8081/tcp
EXPOSE 8081/udp
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]
