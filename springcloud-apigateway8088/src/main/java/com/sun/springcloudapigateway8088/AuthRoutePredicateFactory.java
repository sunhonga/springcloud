package com.sun.springcloudapigateway8088;

import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @ClassName AuthAbstractRoutePredicateFactory
 * @Description TODO
 * Author sunhong
 * Date 2020-08-15 16:00
 **/
@Component
public class AuthRoutePredicateFactory extends AbstractRoutePredicateFactory<AuthRoutePredicateFactory.Config> {

    private static final String NAME_KEY="name";

    public AuthRoutePredicateFactory(){
        super(Config.class);
    }

    @Override
    public List<String> shortcutFieldOrder(){
        return Arrays.asList(NAME_KEY);
    }

    @Override
    public Predicate<ServerWebExchange> apply(Config config) {
        return (exchange->{
            HttpHeaders headers = exchange.getRequest().getHeaders();
            List<String> list = headers.get(config.getName());
            return list.size() > 0;
        });
    }

    public static class Config{
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String name;

    }

}
