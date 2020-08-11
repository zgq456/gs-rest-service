docker build -t springbootdemo4docker .

docker rm -f gs-service || true

docker run --name gs-service -d -p 18080:8080 -p 10122:22 -p 12580:12580 springbootdemo4docker



