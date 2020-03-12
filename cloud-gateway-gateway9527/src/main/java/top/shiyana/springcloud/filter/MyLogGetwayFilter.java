package top.shiyana.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @ProjectName: cloud2020
 * @Package: top.shiyana.springcloud.filter
 * @ClassName: MyLogGetwayFilter
 * @Author: DANGEROUS
 * @Description:
 * @Date: 2020/3/12 16:58
 * @Version: 1.0
 */
@Component
@Slf4j
public class MyLogGetwayFilter implements GlobalFilter, Ordered{
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("============进入=============="+ new Date());
        String name = exchange.getRequest().getQueryParams().getFirst("name");
        if(null==name){
            log.info("用户名非法=============o(╥﹏╥)o");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
