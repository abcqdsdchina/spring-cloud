package club.avence.springcloud.stream.service;

import club.avence.springcloud.stream.StreamProducerApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest(classes=StreamProducerApplication.class)
public class MessageProducerTest {

    @Resource
    private MessageProducer messageProducer;

    @Test
    public void testPost() {
        messageProducer.post();
    }

}
