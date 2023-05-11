
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
npm install json-server -g
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



```
open new terminal 


cd ~

ls 

// check db.json exist


code db.json

// then paste the content in chat within order

// open browser localhost:3000  or refresh page 

check orders data 

// http://localhost:3000/orders 


body("$[0].amount", equa..(300))
body.$[0].items[0].price", equal check 20)
then check subTotal 
then check qty
```

