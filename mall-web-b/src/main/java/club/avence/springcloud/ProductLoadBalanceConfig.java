package club.avence.springcloud;

import com.netflix.loadbalancer.IRule;

public class ProductLoadBalanceConfig {

    public IRule rule() {
        return new com.netflix.loadbalancer.RoundRobinRule();
    }

}
