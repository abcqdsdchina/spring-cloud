package club.avence.springcloud;

import com.netflix.loadbalancer.IRule;

/**
 * @author qian3
 */
public class ProductLoadBalanceConfig {

    public IRule rule() {
        return new com.netflix.loadbalancer.RoundRobinRule();
    }

}
