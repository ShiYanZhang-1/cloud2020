package top.shiyana.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: cloud2020
 * @Package: top.shiyana.springcloud
 * @ClassName: ConsumerZKMaon80
 * @Author: DANGEROUS
 * @Description:
 * @Date: 2020/3/6 20:36
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerZKMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerZKMain80.class,args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
