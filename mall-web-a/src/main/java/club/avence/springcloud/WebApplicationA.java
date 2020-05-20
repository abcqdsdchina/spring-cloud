package club.avence.springcloud;

import com.netflix.loadbalancer.IRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author qian3
 */
@EnableDiscoveryClient
@SpringBootApplication
public class WebApplicationA {

    @Bean
    public IRule rule() {
        return new com.netflix.loadbalancer.RandomRule();
    }

    public static void main(String[] args) {
        SpringApplication.run(WebApplicationA.class, args);
    }

}
