mvn clean package -DskipTests
docker build -t data-ethics-sdk-service .
docker tag data-ethics-sdk-service reg.po.mlamp.cn/cipher/data-ethics-sdk-service:v2.0
docker push reg.po.mlamp.cn/cipher/data-ethics-sdk-service:v2.0