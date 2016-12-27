# Spring Reactive web

### Requeriments
- Java 8
- Maven
- Docker

### Before run
Execute docker to run mongo: `docker run --name formento/spring-reative-web -d mongo`

### To performance test
`docker build -t andreformento/spring-reative-web-test src/test/docker/`

`docker run -v logs/ -P andreformento/spring-reative-web-test`
