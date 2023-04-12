FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app.jar
EXPOSE 8080/tcp
EXPOSE 8080/udp
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]

# mvn clean package -DskipTests
# docker build -t greeting-service:0.0.1 .
# docker tag greeting-service:0.0.1 juniomenchik/greeting-service:0.0.1
# docker images
# docker push juniomenchik/greeting-service:0.0.1
# docker run -p 8080:8080 juniomenchik/greeting-service:0.0.1