package club.avence.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author qian3
 */
@EnableEurekaClient
@EnableFeignClients(basePackages="club.avence.springcloud")
@SpringBootApplication(scanBasePackages="club.avence.springcloud")
public class WebApplicationFeign {

    public static void main(String[] args) {
        SpringApplication.run(WebApplicationFeign.class, args);
    }

}
