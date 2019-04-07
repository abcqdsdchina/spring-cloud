package club.avence.springcloud;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public BasicAuthRequestInterceptor authRequestInterceptor() {
        return new BasicAuthRequestInterceptor("admin", "admin");
    }

    @Bean
    public Logger.Level loggerLevel() {
        return Logger.Level.FULL;
    }

}
