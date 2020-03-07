package top.shiyana.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import top.shiyana.myrule.MyselfRul;

/**
 * @ProjectName: cloud2020
 * @Package: top.shiyana.springcloud
 * @ClassName: OrderMain80
 * @Author: DANGEROUS
 * @Description:
 * @Date: 2020/3/6 12:35
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE" , configuration = MyselfRul.class)
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
