# ibm-microservice-testing-may2023

# KAFKA Workshop Reference

https://github.com/nodesense/kafka


visit docker UI

https://localhost:9443/

add security exception

username: admin

password: admin1234

PGAdmin

http://localhost:5050/login?next=%2F

username: admin@example.com

password: admin

Confluent 

http://localhost:9021

Tracing Service URL

http://0.0.0.0:16686/search

 
# on daily basics

open Lxterminal

```
cd docker

docker compose  -f common.yml -f postgres.yml up -d

docker compose  -f common.yml -f mysql.yml up -d


docker compose  -f common.yml -f jaeger.yml up -d

docker compose  -f common.yml -f kafka.yml up -d

docker compose  -f common.yml -f ms.yml up




intellij-idea-community

```

to start kafka on local dev machine. not needed for day 5
```

confluent local start
```


to start terminal

```
postman
```

To install postman one time

```
sudo snap install postman --edge
```
