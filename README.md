# Spring Eureka Client

### This repo is a client for the load-balanced server Eureka. The way this app works is that it utilizes the RestTemplate annotated with @LoadBalanced and directs the request to the Eureka server. The server then picks an instance of the requested Node and redirects the request to that Node. Then it retreives the response back to the client and maps the response to the intended class.

### Example:
#### 1.Request from RestTemplate to ("http://payment-service/api").
#### 2.Server redirects the request to an instance of payment-service.
#### 3.Gets the response back and maps it. 


