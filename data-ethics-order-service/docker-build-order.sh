mvn clean package -DskipTests
docker build -t cipher/data-ethics-order-service .
docker tag cipher/data-ethics-order-service hub.docker.com/cipher/data-ethics-order-service:v1.0
docker push hub.docker.com/cipher/data-ethics-order-service:v1.0