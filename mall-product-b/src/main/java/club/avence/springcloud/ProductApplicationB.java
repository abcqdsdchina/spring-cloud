package club.avence.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableCircuitBreaker
@SpringBootApplication(scanBasePackages="club.avence.springcloud")
public class ProductApplicationB {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplicationB.class, args);
    }

}
