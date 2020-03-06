package top.shiyana.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: cloud2020
 * @Package: top.shiyana.springcloud.entities
 * @ClassName: CommonResult
 * @Author: DANGEROUS
 * @Description:
 * @Date: 2020/3/6 11:09
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String  message;
    private T       data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
