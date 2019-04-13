package club.avence.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ConfigServerEurekaB {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerEurekaB.class, args);
    }

}
