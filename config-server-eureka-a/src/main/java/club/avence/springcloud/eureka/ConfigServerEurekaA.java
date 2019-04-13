package club.avence.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ConfigServerEurekaA {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerEurekaA.class, args);
    }

}
