 docker container rm cambio-service
 mvn clean package -DskipTests
 docker build -t cambio-service:0.0.1 .
 docker tag cambio-service:0.0.1 juniomenchik/cambio-service:0.0.1
 docker images
 docker push juniomenchik/cambio-service:0.0.1
 docker run --name cambio-service -d -p 8000:8000 juniomenchik/cambio-service:0.0.1