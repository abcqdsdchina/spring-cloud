package club.avence.springcloud.stream.service;

import club.avence.springcloud.product.Product;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;

@EnableBinding(Source.class)
public class MessageProducer implements IMessageProducer {

    @Resource
    private MessageChannel output;

    @Override
    public void post() {
        output.send(MessageBuilder.withPayload(new Product().setId(0L).setName("SpringCloudStreamMessage")).build());
    }

}
