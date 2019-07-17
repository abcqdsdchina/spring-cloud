package club.avence.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author qian3
 */
@SpringBootApplication
public class WebApplicationRibbon {

    @Bean
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
        SpringApplication.run(WebApplicationRibbon.class, args);
    }

}
