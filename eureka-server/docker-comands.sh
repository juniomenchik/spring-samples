 docker container rm eureka-server
 mvn clean package -DskipTests
 docker build -t eureka-server:0.0.1 .
 docker tag eureka-server:0.0.1 juniomenchik/eureka-server:0.0.1
 docker images
 docker push juniomenchik/eureka-server:0.0.1
 docker run --name eureka-server -d -p 8761:8761 juniomenchik/eureka-server:0.0.1