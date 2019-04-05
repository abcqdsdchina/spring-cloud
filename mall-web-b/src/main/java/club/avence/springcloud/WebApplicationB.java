package club.avence.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@EnableEurekaClient
@SpringBootApplication(scanBasePackages="club.avence.springcloud")
@RibbonClient(name="MALL-PRODUCT", configuration=ProductLoadBalanceConfig.class)
public class WebApplicationB {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public HttpHeaders httpHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization",
                "Basic " + new String(Base64.getEncoder().encode("admin:admin".getBytes(StandardCharsets.US_ASCII))));
        return httpHeaders;
    }

    public static void main(String[] args) {
        SpringApplication.run(WebApplicationB.class, args);
    }

}
