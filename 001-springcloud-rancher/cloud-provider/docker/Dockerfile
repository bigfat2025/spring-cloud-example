FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER bigfat@bigfat.com

ARG PROJECT_BUILD_NAME

ENV APP_NAME $PROJECT_BUILD_NAME
RUN echo $APP_NAME

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /app


WORKDIR /app

RUN mkdir -p /app/conf

EXPOSE 8090

COPY ./$PROJECT_BUILD_NAME.jar /app/app.jar
COPY ./application.yml /app/conf/application.yml

CMD java -Djava.security.egd=file:/dev/./urandom -Xms64m -Xmx64m -jar app.jar