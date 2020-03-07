package top.shiyana.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.shiyana.springcloud.entities.CommonResult;
import top.shiyana.springcloud.entities.Payment;
import top.shiyana.springcloud.service.FeignPaymentService;

import javax.annotation.Resource;

/**
 * @ProjectName: cloud2020
 * @Package: top.shiyana.springcloud.controller
 * @ClassName: FeignOrderCOntroller
 * @Author: DANGEROUS
 * @Description:
 * @Date: 2020/3/7 20:31
 * @Version: 1.0
 */
@RestController
@Slf4j
public class FeignOrderController {

    @Resource
    private FeignPaymentService feignPaymentService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> paymentCommonResult(@PathVariable("id") Long id){
        return feignPaymentService.getPayment(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        // openfeign-ribbon, 客户端一般默认等待1秒钟
        return feignPaymentService.paymentFeignTimeout();
    }

}
