mvn clean package -DskipTests
docker build -t cipher/data-ethics-desensitization-service .
docker tag cipher/data-ethics-desensitization-service hub.docker.com/cipher/data-ethics-desensitization-service:v1.0
docker push hub.docker.com/cipher/data-ethics-desensitization-service:v1.0