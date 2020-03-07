package top.shiyana.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: cloud2020
 * @Package: top.shiyana.springcloud
 * @ClassName: OrderConsul80
 * @Author: DANGEROUS
 * @Description:
 * @Date: 2020/3/6 21:37
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsul80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsul80.class,args);
    }
}
