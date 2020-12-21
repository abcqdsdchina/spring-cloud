package club.avence.springcloud.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qian3
 */
@RestController
public class ConfigController {

    // @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/spring/application/name")
    public String applicationName() {
        return applicationName;
    }

}
