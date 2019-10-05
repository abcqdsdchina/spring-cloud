package club.avence.reactor.flux;

import org.junit.Test;
import reactor.core.publisher.Flux;

public class FluxCreateTest {

    @Test
    public void test() {
        Flux.create(sink -> {
            //向下游发布元素
            sink.next("hello-world");
            sink.next("hello-world-2");
            //结束发布元素
            sink.complete();
        }).subscribe(System.out::println);
    }

}
