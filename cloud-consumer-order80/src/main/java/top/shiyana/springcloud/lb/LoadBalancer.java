package top.shiyana.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @ProjectName: cloud2020
 * @Package: top.shiyana.springcloud.lb
 * @ClassName: LoadBalancer
 * @Author: DANGEROUS
 * @Description:
 * @Date: 2020/3/7 19:53
 * @Version: 1.0
 */
public interface LoadBalancer {
    /**
     * 获取存活的服务实例列表
     *
     * @param serviceInstances
     * @return
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}