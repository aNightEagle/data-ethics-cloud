mvn clean package -DskipTests
docker build -t cipher/data-ethics-video-service .
docker tag cipher/data-ethics-video-service:latest hub.docker.com/cipher/data-ethics-video-service:v1.0
docker push hub.docker.com/cipher/data-ethics-video-service:v1.0