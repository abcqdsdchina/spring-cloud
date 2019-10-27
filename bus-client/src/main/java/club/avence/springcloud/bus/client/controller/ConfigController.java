package club.avence.springcloud.bus.client.controller;

import club.avence.springcloud.bus.client.config.ApplicationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qian3
 */
@RestController
public class ConfigController {

    @Autowired
    private ApplicationConfig applicationConfig;

    @GetMapping("/spring/application/name")
    public String applicationName() {
        return applicationConfig.getApplicationName();
    }

}
