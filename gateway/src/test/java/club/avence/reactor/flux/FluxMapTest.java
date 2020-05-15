package club.avence.reactor.flux;

import org.junit.Test;
import reactor.core.publisher.Flux;

public class FluxMapTest {

    @Test
    public void test() {
        Flux.just("tom", "jack", "allen")
                .map(s -> s.concat("@qq.com"))
                .subscribe(System.out::println);
    }

}
