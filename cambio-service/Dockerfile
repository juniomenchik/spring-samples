FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app.jar
EXPOSE 8000/tcp
EXPOSE 8000/udp
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]

# mvn clean package -DskipTests
# docker build -t cambio-service:0.0.1 .
# docker tag cambio-service:0.0.1 juniomenchik/cambio-service:0.0.1
# docker images
# docker push juniomenchik/cambio-service:0.0.1
# docker run -p 8000:8000 juniomenchik/cambio-service:0.0.1