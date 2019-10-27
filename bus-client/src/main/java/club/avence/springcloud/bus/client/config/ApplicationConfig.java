package club.avence.springcloud.bus.client.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author qian3
 */
@Data
@Component
@RefreshScope
public class ApplicationConfig {

    @Value("${spring.application.name}")
    private String applicationName;

}
