package top.shiyana.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: cloud2020
 * @Package: top.shiyana.springcloud.config
 * @ClassName: FeignConfig
 * @Author: DANGEROUS
 * @Description:
 * @Date: 2020/3/7 20:58
 * @Version: 1.0
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
