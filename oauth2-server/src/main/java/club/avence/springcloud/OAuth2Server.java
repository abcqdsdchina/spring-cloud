package club.avence.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @author qian3
 */
@EnableEurekaClient
@EnableAuthorizationServer
@SpringBootApplication(scanBasePackages="club.avence.springcloud")
public class OAuth2Server {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2Server.class, args);
    }

}
