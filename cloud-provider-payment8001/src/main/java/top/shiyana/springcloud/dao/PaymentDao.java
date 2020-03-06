package top.shiyana.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.shiyana.springcloud.entities.Payment;

/**
 * @ProjectName: cloud2020
 * @Package: top.shiyana.springcloud.dao
 * @ClassName: PaymentDao
 * @Author: DANGEROUS
 * @Description:
 * @Date: 2020/3/6 11:13
 * @Version: 1.0
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);
    Payment getPayment(@Param("id") Long id);
}
