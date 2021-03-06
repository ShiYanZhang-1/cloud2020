package top.shiyana.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: cloud2020
 * @Package: top.shiyana.springcloud.config
 * @ClassName: ApplicationContextConfig
 * @Author: DANGEROUS
 * @Description:
 * @Date: 2020/3/6 21:38
 * @Version: 1.0
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
