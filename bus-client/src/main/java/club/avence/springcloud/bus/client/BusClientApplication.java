package club.avence.springcloud.bus.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qian3
 */
@EnableEurekaClient
@SpringBootApplication
public class BusClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusClientApplication.class, args);
    }

}
