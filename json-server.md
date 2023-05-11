
Open New Terminal


```
wget -qO- https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.3/install.sh | bash
```

close the terminal

open new terminal [since path is updated on new terminal]

install node.js 16

```
nvm install 16
```

check node version

```
node -v
```

### set up json server

```
sudo npm install json-server -g
```

place holder for sample data

```
wget https://raw.githubusercontent.com/nodesense/ibm-microservice-testing-may2023/main/db.json
```


now run the test server

```
json-server --watch db.json
```

Testing



http://localhost:3000


http://localhost:3000/products



http://localhost:3000/products/1

For other APIS, refer documentation

https://www.npmjs.com/package/json-server


