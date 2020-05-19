package club.avence.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableEurekaClient
@EnableCircuitBreaker
@EnableResourceServer
@SpringBootApplication(scanBasePackages="club.avence.springcloud")
public class ProductApplicationA {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplicationA.class, args);
    }

}
