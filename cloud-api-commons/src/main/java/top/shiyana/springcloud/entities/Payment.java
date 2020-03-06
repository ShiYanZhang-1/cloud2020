package top.shiyana.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ProjectName: cloud2020
 * @Package: top.shiyana.springcloud.entities
 * @ClassName: Payment
 * @Author: DANGEROUS
 * @Description:
 * @Date: 2020/3/6 11:07
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private long id;
    private String serial;
}
