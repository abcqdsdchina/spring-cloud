package club.avence.springcloud;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;

@Configuration
public class OAuth2Config {

    @Bean
    @LoadBalanced
    public OAuth2RestTemplate oAuth2RestTemplate(
            ClientCredentialsResourceDetails clientCredentialsResourceDetails,
            DefaultOAuth2ClientContext defaultOAuth2ClientContext) {
        return new OAuth2RestTemplate(clientCredentialsResourceDetails, defaultOAuth2ClientContext);
    }

}
