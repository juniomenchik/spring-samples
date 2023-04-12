FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app.jar
EXPOSE 8765/tcp
EXPOSE 8765/udp
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]

# mvn clean package -DskipTests
# docker build -t api-gateway:0.0.1 .
# docker tag api-gateway:0.0.1 juniomenchik/api-gateway:0.0.1
# docker images
# docker push juniomenchik/api-gateway:0.0.1
# docker run -p 8765:8765 juniomenchik/api-gateway:0.0.1
# docker run --name api-gateway -d -p 8765:8765 juniomenchik/api-gateway:0.0.1