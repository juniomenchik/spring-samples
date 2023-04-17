FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app.jar
EXPOSE 8761/tcp
EXPOSE 8761/udp
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]

