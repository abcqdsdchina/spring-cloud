package club.avence.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaApplicationB {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicationB.class, args);
    }

}
