package club.avence.reactor.flux;

import org.junit.Test;
import reactor.core.publisher.Flux;

public class FluxTest {

    @Test
    public void test() {
        Flux.just("tom", "jack", "allen")
                .subscribe(System.out::println);
    }

}
