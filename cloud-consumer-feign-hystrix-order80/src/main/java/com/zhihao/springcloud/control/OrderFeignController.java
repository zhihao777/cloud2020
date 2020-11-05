package com.zhihao.springcloud.control;

import com.zhihao.springcloud.entities.CommonResult;
import com.zhihao.springcloud.entities.Payment;
import com.zhihao.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        String result = paymentFeignService.paymentInfo_OK(id);
        log.info("*******result:"+result);
        return result;
    }
    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        String result = paymentFeignService.paymentInfo_TimeOut(id);
        log.info("*******result:"+result);
        return result;
    }
}
