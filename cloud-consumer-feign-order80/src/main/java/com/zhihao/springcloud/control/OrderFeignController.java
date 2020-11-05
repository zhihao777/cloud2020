package com.zhihao.springcloud.control;

import com.zhihao.springcloud.entities.CommonResult;
import com.zhihao.springcloud.entities.Payment;
import com.zhihao.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName OrderFeignController
 * @Description: TODO
 * @Author zhiHao
 * @Date 2020/8/18
 * @Version V1.0
 **/
@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }
}
