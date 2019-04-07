package club.avence.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableCircuitBreaker
@SpringBootApplication(exclude={SecurityAutoConfiguration.class, ManagementWebSecurityAutoConfiguration.class})
public class UserApplicationA {

    public static void main(String[] args) {
        SpringApplication.run(UserApplicationA.class, args);
    }

}
