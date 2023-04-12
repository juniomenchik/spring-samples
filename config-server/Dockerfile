FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app.jar
EXPOSE 8888/tcp
EXPOSE 8888/udp
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]

# mvn clean package -DskipTests
# docker build -t config-server:0.0.1 .
# docker tag config-server:0.0.1 juniomenchik/config-server:0.0.1
# docker images
# docker push juniomenchik/config-server:0.0.1
# docker run -p 8888:8888 juniomenchik/config-server:0.0.1
# docker run --name config-server -d -p 8888:8888 juniomenchik/config-server:0.0.1