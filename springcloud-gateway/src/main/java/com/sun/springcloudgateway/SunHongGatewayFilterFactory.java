package com.sun.springcloudgateway;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@Component
public class SunHongGatewayFilterFactory extends AbstractGatewayFilterFactory<SunHongGatewayFilterFactory.SunHongConfig> {

    private static final String NAME_KEY = "name";

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList(NAME_KEY);
    }

    public SunHongGatewayFilterFactory() {
        super(SunHongConfig.class);
    }

    @Override
    public GatewayFilter apply(SunHongConfig config) {
        return (((exchange, chain) -> {
            System.out.println("请求来之前");
            //TODO
            return chain.filter(exchange).then(Mono.fromRunnable(()->{
                System.out.println("请求回来了");
            }));
        }));
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
