mvn clean package -DskipTests
docker build -t cipher/infra-abrs-backend .
docker tag cipher/infra-abrs-backend hub.docker.com/cipher/infra-abrs-backend:v0.7
docker push hub.docker.com/cipher/infra-abrs-backend