package club.avence.reactor.flux;

import org.junit.Test;
import reactor.core.publisher.Flux;

public class FluxTest {

    @Test
    public void test() {
        Flux.just("tom", "jack", "allen")
                .filter(s -> s.length() > 3)
                .map(s -> s.concat("@qq.com"))
                .subscribe(System.out::println);
    }

}
