FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app.jar
EXPOSE 8100/tcp
EXPOSE 8100/udp
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]

# mvn clean package -DskipTests
# docker build -t book-service:0.0.1 .
# docker tag book-service:0.0.1 juniomenchik/book-service:0.0.1
# docker images
# docker push juniomenchik/book-service:0.0.1
# docker run -p 8100:8100 juniomenchik/book-service:0.0.1