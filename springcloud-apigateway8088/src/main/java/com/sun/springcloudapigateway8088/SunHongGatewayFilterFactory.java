package com.sun.springcloudapigateway8088;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName SunHongGatewayFilterFactory
 * @Description TODO
 * Author sunhong
 * Date 2020-08-15 16:18
 **/
@Component
public class SunHongGatewayFilterFactory extends AbstractGatewayFilterFactory<SunHongGatewayFilterFactory.SunHongConfig> {

    private static final String NAME_KEY="name";

    public SunHongGatewayFilterFactory() {
        super(SunHongConfig.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList(NAME_KEY);
    }

    @Override
    public GatewayFilter apply(SunHongConfig config) {
        return ((exchange,chain)->{
            System.out.println(config.getName());
            return chain.filter(exchange).then(Mono.fromRunnable(()->{
                System.out.println(":");
            }));
        });
    }

    public static class SunHongConfig{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
