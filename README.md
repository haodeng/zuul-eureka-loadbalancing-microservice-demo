"# zuul-eureka-loadbalancing-microservice-demo" 
# A demo to use Zuul as load balancer for micro service

Setup a Eureka server

Register 2 hello service, one on 8000, one on 8001

Register a Zuul server, running on 8762

Check out Eureka: http://localhost:8761/

![capture](https://user-images.githubusercontent.com/2106362/49255487-73013f00-f42c-11e8-875e-164b5b5baa6b.JPG)



# Test

send some requests to http://localhost:8762/hello-service/hello

You should expect results from different instance of hello-service:

````java
Hello from port 8001!
Hello from port 8000!
````
