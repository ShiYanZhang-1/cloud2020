package top.shiyana.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.shiyana.springcloud.entities.CommonResult;
import top.shiyana.springcloud.entities.Payment;
import top.shiyana.springcloud.service.PaymentService;

/**
 * @ProjectName: cloud2020
 * @Package: top.shiyana.springcloud.controller
 * @ClassName: PaymentController
 * @Author: DANGEROUS
 * @Description:
 * @Date: 2020/3/6 11:53
 * @Version: 1.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping(value = "/payment/creat")
    public CommonResult creat(@RequestBody Payment payment){
        int i = service.create(payment);
        log.info("插入结果"+i);
        if(i>0){
            return new CommonResult(200,"插入数据库成功",i);
        }else {
            return new CommonResult(404,"插入数据库失败");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id){
        Payment payment = service.getPayment(id);
        log.info("查询结果"+payment);
        if(null!=payment){
            return new CommonResult(200,"查询成功",payment);
        }else {
            return new CommonResult(404,"查询失败");
        }
    }

}
