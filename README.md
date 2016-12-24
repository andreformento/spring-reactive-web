# Spring Reactive web

### Before run
Execute docker to run mongo: `docker run --name formento/spring-reative-web -d mongo`

### To test performance
docker run -v /path/to/tsung.xml:/root/.tsung/tsung.xml -v /path/to/logs:/root/.tsung/log -P andreformento/tsung:1.6
