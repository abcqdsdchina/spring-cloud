package club.avence.springcloud.stream.service;

import club.avence.springcloud.product.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

@Slf4j
@EnableBinding(Sink.class)
public class MessageConsumerService {

    @StreamListener(Sink.INPUT)
    public void consume(Message<Product> message) {
        log.info("接收到消息：{}", message);
    }

}
