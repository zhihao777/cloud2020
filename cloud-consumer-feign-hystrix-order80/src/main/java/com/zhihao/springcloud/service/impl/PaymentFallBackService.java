package com.zhihao.springcloud.service.impl;

import com.zhihao.springcloud.service.PaymentFeignService;
import org.springframework.stereotype.Component;

/**
 * @ClassName PaymentFallBackService
 * @Description: TODO
 * @Author zhiHao
 * @Date 2020/11/6
 * @Version V1.0
 **/
@Component
public class PaymentFallBackService implements PaymentFeignService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallBackService===全局feign接口实现类";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallBackService===全局feign接口实现类";
    }

    @Override
    public String paymentCircuitBreaker(Integer id) {
        return "PaymentFallBackService===全局feign接口实现类";
    }
}
