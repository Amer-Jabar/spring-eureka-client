package eureka.client;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller<T> {
    
    private RestTemplate rest;
    
    public Controller(@LoadBalanced RestTemplate rest) {
        this.rest = rest;
    }
    
    @GetMapping("/api")
    public Object getApi() {
        
        Object res = rest
                .getForObject(
                        "http://node-1/api",
                        Object.class
                );
        
        return res;
    }
    
}

