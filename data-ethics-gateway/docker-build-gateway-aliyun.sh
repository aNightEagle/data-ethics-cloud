mvn clean package -DskipTests
docker build -t data-ethics-gateway .
docker tag data-ethics-gateway registry.cn-hangzhou.aliyuncs.com/itcrazy1998/test:v1.0
docker push registry.cn-hangzhou.aliyuncs.com/itcrazy1998/test:v1.0