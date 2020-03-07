package top.shiyana.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import top.shiyana.springcloud.entities.CommonResult;
import top.shiyana.springcloud.entities.Payment;

/**
 * @ProjectName: cloud2020
 * @Package: top.shiyana.springcloud.service
 * @ClassName: FeignPaymentService
 * @Author: DANGEROUS
 * @Description:
 * @Date: 2020/3/7 20:26
 * @Version: 1.0
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface FeignPaymentService {
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id);

    @PostMapping(value = "/payment/creat")
    public CommonResult creat(@RequestBody Payment payment);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();

}
