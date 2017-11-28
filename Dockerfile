FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD hello-springboot-app-1.0.jar springbootsample.jar
RUN sh -c 'touch /springbootsample.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /springbootsample.jar" ]
EXPOSE 8080
