FROM java:11

ENV BASE_PATH=/infra-abrs/app
ENV JAR_FILE=target/eip-inference-feed-1.0.0.jar
ENV JAR_NAME=infra-abrs-backend.jar

RUN mkdir -p ${BASE_PATH}
RUN mkdir -p ${BASE_PATH}/conf
RUN mkdir -p ${BASE_PATH}/logs

ARG JAVA_OPTS="-server -Xms3G -Xmx3G -Xss256k -XX:MetaspaceSize=128m -XX:MaxMetaspaceSize=128m -XX:+UseParallelOldGC -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=dump.log -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:${BASE_PATH}/logs/gc.log -XX:NewSize=1G -XX:MaxNewSize=1G"

# 设置时区
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone

COPY src/main/resources/logback.xml ${BASE_PATH}/conf
COPY ${JAR_FILE} ${BASE_PATH}/${JAR_NAME}

RUN bash -c 'touch ${BASE_PATH}/${JAR_NAME}'


CMD java -jar ${BASE_PATH}/${JAR_NAME} --spring.profiles.active=${MODEL_VERSION} --logging.config=${BASE_PATH}/conf/logback.xml 1> ${BASE_PATH}/logs/debug 2>&1

EXPOSE 8082
