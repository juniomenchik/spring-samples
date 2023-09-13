 docker container rm config-server
 mvn clean package -DskipTests
 docker build -t config-server:0.0.1 .
 docker tag config-server:0.0.1 juniomenchik/config-server:0.0.1
 docker images
 docker push juniomenchik/config-server:0.0.1
 docker run --name config-server -d -p 8888:8888 juniomenchik/config-server:0.0.1