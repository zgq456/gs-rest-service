ssh -p 10122 -i id_rsa root@192.168.xx.xx 


bash ~/sandbox/bin/sandbox.sh -p `ps -ef | grep "app.jar" | grep -v grep | awk '{print $2}'` -S

1.install-local.sh -- remove typeset option: curl -s http://sandbox-ecological.oss-cn-hangzhou.aliyuncs.com/install-repeater.sh | sh
2.update repeater.properties http://172.17.0.1:8001/
3.java -Djava.security.egd=file:/dev/./urandom -Dapp.name=gs-service -Dapp.env=daily -jar /app.jar

     


http://172.17.0.1:8001/


https://www.jianshu.com/p/397929dbc27d

docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' 61f3a376954d

#ssh root@172.17.0.2 -p 10122  
ssh root@172.17.0.2  
 
docker build -t springbootdemo4docker .

--name gs-service
docker run --name gs-service -d -p 18080:8080 -p 10122:22 springbootdemo4docker