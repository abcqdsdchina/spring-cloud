package club.avence.jdk;

import org.junit.Test;

public class VolatileTest {

    volatile int i = 1;

    @Test
    public void test() {
        System.out.println(i = 10);
    }

}
