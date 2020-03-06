package top.shiyana.springcloud.service;

import org.apache.ibatis.annotations.Param;
import top.shiyana.springcloud.entities.Payment;

/**
 * @ProjectName: cloud2020
 * @Package: top.shiyana.springcloud.service
 * @ClassName: PaymentService
 * @Author: DANGEROUS
 * @Description:
 * @Date: 2020/3/6 11:49
 * @Version: 1.0
 */
public interface PaymentService {

    int create(Payment payment);
    Payment getPayment(@Param("id") Long id);
}
