FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app.jar
EXPOSE 8761/tcp
EXPOSE 8761/udp
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]

# mvn clean package -DskipTests
# docker build -t eureka-server:0.0.1 .
# docker tag eureka-server:0.0.1 juniomenchik/eureka-server:0.0.1
# docker images
# docker push juniomenchik/eureka-server:0.0.1
# docker run --name eureka-server -d -p 8761:8761 juniomenchik/eureka-server:0.0.1