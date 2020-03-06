package top.shiyana.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ProjectName: cloud2020
 * @Package: top.shiyana.springcloud.controller
 * @ClassName: OrderZkController
 * @Author: DANGEROUS
 * @Description:
 * @Date: 2020/3/6 20:39
 * @Version: 1.0
 */
@RestController
@Slf4j
public class OrderZkController {
    private static final String INVOKE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/payment/zk")
    public String string(){
        return restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
    }

}
