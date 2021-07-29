mvn clean package -DskipTests
docker build -t data-ethics-desensitization-service .
docker tag data-ethics-desensitization-service reg.po.mlamp.cn/cipher/data-ethics-desensitization-service:v2.0
docker push reg.po.mlamp.cn/cipher/data-ethics-desensitization-service:v2.0