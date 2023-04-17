 docker container rm api-gateway
 mvn clean package -DskipTests
 docker build -t api-gateway:0.0.1 .
 docker tag api-gateway:0.0.1 juniomenchik/api-gateway:0.0.1
 docker images
 docker push juniomenchik/api-gateway:0.0.1
 docker run -p 8765:8765 juniomenchik/api-gateway:0.0.1
 docker run --name api-gateway -d -p 8765:8765 juniomenchik/api-gateway:0.0.1