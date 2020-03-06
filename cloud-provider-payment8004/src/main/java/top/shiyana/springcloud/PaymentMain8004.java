package top.shiyana.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import top.shiyana.springcloud.entities.Payment;

/**
 * @ProjectName: cloud2020
 * @Package: top.shiyana.springcloud
 * @ClassName: PaymentMain8004
 * @Author: DANGEROUS
 * @Description:
 * @Date: 2020/3/6 19:25
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient  //该注解用于向使用consul或者Zookeeper作为注册中心时注册服务
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class,args);
    }
}
