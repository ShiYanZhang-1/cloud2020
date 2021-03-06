package top.shiyana.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ProjectName: cloud2020
 * @Package: top.shiyana.springcloud
 * @ClassName: EurekaMain7001
 * @Author: DANGEROUS
 * @Description:
 * @Date: 2020/3/6 14:13
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class,args);
    }
}
