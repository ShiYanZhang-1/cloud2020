package top.shiyana.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.shiyana.springcloud.entities.CommonResult;
import top.shiyana.springcloud.entities.Payment;

/**
 * @ProjectName: cloud2020
 * @Package: top.shiyana.springcloud.controller
 * @ClassName: OrderController
 * @Author: DANGEROUS
 * @Description:
 * @Date: 2020/3/6 13:16
 * @Version: 1.0
 */
@RestController
@Slf4j
public class OrderController {

//    public static final String PAYMENT_URL = "http://localhost:8001";
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";



    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/creat")
    public CommonResult<Payment> creat(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/creat",payment,CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> creat(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/getForEntity/{id}")
    public CommonResult<Payment> creat1(@PathVariable("id") Long id){
        ResponseEntity<CommonResult> body = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
        if(body.getStatusCode().is2xxSuccessful()){
            return new CommonResult(200,"查询成功",body.getBody());
        }else {
            return new CommonResult(400,"查询失败");
        }
    }
}
