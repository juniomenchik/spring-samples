 docker container rm book-service
 mvn clean package -DskipTests
 docker build -t book-service:0.0.1 .
 docker tag book-service:0.0.1 juniomenchik/book-service:0.0.1
 docker images
 docker push juniomenchik/book-service:0.0.1
 docker run --name book-service -p 8100:8100 juniomenchik/book-service:0.0.1