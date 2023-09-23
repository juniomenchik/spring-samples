 docker container rm greeting-service
 mvn clean package -DskipTests
 docker build -t greeting-service:0.0.1 .
 docker tag greeting-service:0.0.1 juniomenchik/greeting-service:0.0.1
 docker images
 docker push juniomenchik/greeting-service:0.0.1
 docker run --name greeting-service -d -p 8080:8080 juniomenchik/greeting-service:0.0.1