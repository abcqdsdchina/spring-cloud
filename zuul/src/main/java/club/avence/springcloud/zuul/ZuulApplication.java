package club.avence.springcloud.zuul;

import club.avence.springcloud.zuul.filter.AuthenticationFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author qian3
 */
@EnableZuulProxy
@SpringBootApplication
public class ZuulApplication {

    @Bean
    public AuthenticationFilter authorizationFilter() {
        return new AuthenticationFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

}
