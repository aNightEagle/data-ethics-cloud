mvn clean package -DskipTests
docker build -t data-ethics-gateway .
docker tag data-ethics-gateway reg.po.mlamp.cn/cipher/data-ethics-gateway:v1.3
docker push reg.po.mlamp.cn/cipher/data-ethics-gateway:v1.3