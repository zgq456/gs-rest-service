# Docker image for springboot file run
# VERSION 0.0.1
# Author: eangulee
# 基础镜像使用java
#FROM java:8
FROM ksimple/java8-mvn-nodejs-npm-python3

#ADD sources.list /etc/apt/
#RUN apt-get install -y apt-transport-https
#

RUN apt-get update
RUN apt-get install -y vim
RUN apt-get install -y openssh-server
RUN apt-get install -y tree

RUN mkdir -p /var/run/sshd
RUN mkdir -p /root/.ssh

#取消pam限制
RUN sed -ri 's/session required pam_loginuid.so/#session required pam_loginuid.so/g' /etc/pam.d/sshd
#复制配置文件到相应位置，并赋予脚本可执行权限
ADD authorized_keys /root/.ssh/authorized_keys
RUN chmod 600 /root/.ssh/authorized_keys

ADD id_rsa /root/.ssh/id_rsa
ADD id_rsa.pub /root/.ssh/id_rsa.pub

RUN echo 'JAVA_HOME=/usr/lib/jvm/java-8-oracle' >> /root/.bashrc
RUN /bin/bash -c "/root/.bashrc"

ADD run.sh /run.sh
RUN chmod 755 /run.sh

#开放端口
EXPOSE 22

# VOLUME 指定了临时文件目录为/tmp。
# 其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp
VOLUME /tmp
# 将jar包添加到容器中并更名为app.jar
ADD gs-rest-service-0.1.0.jar app.jar
# 运行jar包
RUN bash -c 'touch /app.jar'
CMD ["/run.sh"]