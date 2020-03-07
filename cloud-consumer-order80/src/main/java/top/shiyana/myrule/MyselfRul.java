package top.shiyana.myrule;

import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: cloud2020
 * @Package: top.shiyana.myrule
 * @ClassName: MyselfRul
 * @Author: DANGEROUS
 * @Description:  由于想要使用ribbon的其他负载均衡算法，不能将ribbo的配置类放在含有@ComponentScan注解的包以及子包所以只能新建一个包
 * @Date: 2020/3/7 11:09
 * @Version: 1.0
 */
@Configuration
public class MyselfRul {
    /**
     * 一、RoundRobinRule
     * 1、轮询，依次执行每个执行一次(默认)
     *
     * 二、RandomRule
     * 1、随机
     * 2、在客户端(80)的配置类上(ConfigBean.java)加上新的Bean覆盖默认的轮询
     *
     * 三、AvailabilityFilteringRule
     * 1、会先过滤掉多次访问故障而处于断路器跳闸状态的服务
     * 2、和过滤并发的连接数量超过阀值得服务，然后对剩余的服务列表安装轮询策略进行访问
     *
     * 四、WeightedResponseTimeRule
     * 1、根据平均响应时间计算所有的服务的权重，响应时间越快服务权重越大，容易被选中的概率就越高。
     * 2、刚启动时，如果统计信息不中，则使用RoundRobinRule(轮询)策略，等统计的信息足够了会自动的切换到WeightedResponseTimeRule
     *
     * 五、RetryRule
     * 1、先按照RoundRobinRule(轮询)的策略获取服务，如果获取的服务失败侧在指定的时间会进行重试，进行获取可用的服务
     * 2、如多次获取某个服务失败，这不会再再次获取该服务如(高德地图上某条道路堵车，司机不会走那条道路)
     *
     * 六、BestAvailableRule
     * 1、会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务，然后选择一个并发量最小的服务
     *
     * 七、ZoneAvoidanceRule
     * 1、默认规则，复合判断Server所在区域的性能和Server的可用性选择服务器
*/
  /*  @Bean
    public IRule rule(){
        return new RandomRule(); //定义为随机
    }*/

    @Bean
    public IRule rule(){
        return new BestAvailableRule(); //优先
    }
}
