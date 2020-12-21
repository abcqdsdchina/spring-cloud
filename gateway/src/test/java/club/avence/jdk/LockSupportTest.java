package club.avence.jdk;

import org.junit.Test;

import java.util.concurrent.locks.LockSupport;

public class LockSupportTest {

    @Test
    public void test() throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                System.out.println("进入测试线程，准备睡眠.");
                Thread.sleep(2000);
                LockSupport.park();
                System.out.println("睡眠结束.");
            } catch(Exception e) {
                System.err.println(e.getMessage());
            }
        }, "测试线程");

        t.start();
        Thread.sleep(1000);
        LockSupport.unpark(t);
        t.join();
    }

}
