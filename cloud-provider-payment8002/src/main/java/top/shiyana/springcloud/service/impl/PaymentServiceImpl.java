package top.shiyana.springcloud.service.impl;

import org.springframework.stereotype.Service;
import top.shiyana.springcloud.dao.PaymentDao;
import top.shiyana.springcloud.entities.Payment;
import top.shiyana.springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @ProjectName: cloud2020
 * @Package: top.shiyana.springcloud.service.impl
 * @ClassName: PaymentServiceImpl
 * @Author: DANGEROUS
 * @Description:
 * @Date: 2020/3/6 11:50
 * @Version: 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPayment(Long id) {
        return paymentDao.getPayment(id);
    }
}
