package top.shiyana.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: cloud2020
 * @Package: top.shiyana.springcloud.config
 * @ClassName: GetwayConfig
 * @Author: DANGEROUS
 * @Description:
 * @Date: 2020/3/12 15:37
 * @Version: 1.0
 */
@Configuration
public class GetwayConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("route_path_shiyana",r ->r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }

}
