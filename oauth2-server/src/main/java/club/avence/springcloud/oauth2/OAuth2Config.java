package club.avence.springcloud.oauth2;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

@Configuration
public class OAuth2Config extends AuthorizationServerConfigurerAdapter {

    @Override
    public void configure(AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
        oauthServer.tokenKeyAccess("permitAll()")
                .checkTokenAccess("isAuthenticated()")
                .allowFormAuthenticationForClients();
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("demoApp")
                .secret("{bcrypt}" + new BCryptPasswordEncoder().encode("demoAppSecret"))
                .authorizedGrantTypes("client_credentials", "password", "refresh_token")
                .scopes("all")
                .resourceIds("oauth2-resource")
                .accessTokenValiditySeconds(1200)
                .refreshTokenValiditySeconds(50000)
                .and()
                .withClient("productApp")
                .secret("{bcrypt}" + new BCryptPasswordEncoder().encode("aa3sd#gk"))
                .authorizedGrantTypes("client_credentials")
                .scopes("all")
                .resourceIds("oauth2-resource")
                .accessTokenValiditySeconds(1200)
                .refreshTokenValiditySeconds(50000);
    }

}
