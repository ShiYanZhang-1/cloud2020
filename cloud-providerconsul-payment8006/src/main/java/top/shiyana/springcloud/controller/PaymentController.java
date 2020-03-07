package top.shiyana.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ProjectName: cloud2020
 * @Package: top.shiyana.springcloud.controller
 * @ClassName: PaymentController
 * @Author: DANGEROUS
 * @Description:
 * @Date: 2020/3/6 21:26
 * @Version: 1.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/consul")
    public String zookeeper(){
        return "springcloud with consul" +serverPort +"\t" + UUID.randomUUID().toString();
    }
}
