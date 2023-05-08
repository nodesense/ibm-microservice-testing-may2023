After running commands, open , add security exception in browser..



Open terminal, run the command in any directory


```
docker volume create portainer_data2x


docker run -d -p 8000:8000 -p 9443:9443 --name portainer2x \
   --restart=always \
   -v /var/run/docker.sock:/var/run/docker.sock \
   -v portainer_data2x:/data \
   portainer/portainer-ce:2.9.3
```


```
mkdir docker

cd docker

wget https://raw.githubusercontent.com/nodesense/kafka/main/docker/.env

wget https://raw.githubusercontent.com/nodesense/kafka/main/docker/common.yml


wget https://raw.githubusercontent.com/nodesense/kafka/main/docker/postgres.yml

```

``` 
docker compose  -f common.yml -f postgres.yml up -d
```

visit docker UI

https://localhost:9443/



add security exception

username: admin

password: admin1234


----


Now setup postgres Admin 


Visit 

http://localhost:5050/login?next=%2F


username: admin@example.com

password: admin


add postgres database in pgadmin
