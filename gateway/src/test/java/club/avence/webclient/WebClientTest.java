package club.avence.webclient;

import org.junit.Test;
import org.springframework.http.HttpMethod;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class WebClientTest {

    @Test
    public void test() throws Exception {
        WebClient.create()
                .method(HttpMethod.GET)
                .uri("http://baidu.com")
                .retrieve()
                .bodyToMono(String.class).subscribe(System.out::println);

        Thread.sleep(100000000);
    }

}
