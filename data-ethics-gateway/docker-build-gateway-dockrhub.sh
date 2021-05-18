mvn clean package -DskipTests
docker build -t data-ethics-gateway .
docker tag data-ethics-gateway zhouchaodocker/data-ethics-gateway:v1.0
docker push zhouchaodocker/data-ethics-gateway:v1.0