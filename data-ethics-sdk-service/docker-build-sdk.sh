mvn clean package -DskipTests
docker build -t cipher/data-ethics-sdk-service .
docker tag cipher/data-ethics-sdk-service:latest hub.docker.com/cipher/data-ethics-sdk-service:v1.0
docker push hub.docker.com/cipher/data-ethics-sdk-service:v1.0