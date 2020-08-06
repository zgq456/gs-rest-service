#! /bin/bash
export JAVA_HOME=/usr/lib/jvm/java-8-oracle
service ssh start
sh /install-repeater.sh
cp /repeater.properties /root/.sandbox-module/cfg/
java -Djava.security.egd=file:/dev/./urandom -Dapp.name=gs-service -Dapp.env=daily -jar /app.jar
#bash ~/sandbox/bin/sandbox.sh -p `ps -ef | grep "app.jar" | grep -v grep | awk '{print $2}'` -P 12580