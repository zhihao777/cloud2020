package com.zhihao.springcloud.control;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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
//@DefaultProperties(defaultFallback = "paymentInfo_TimeOutGlobalHandler")
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/payment/hystrix/ok/{id}")
    //@HystrixCommand
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        String result = paymentFeignService.paymentInfo_OK(id);
        log.info("*******result:"+result);
        return result;
    }
    @GetMapping("/payment/hystrix/timeout/{id}")
    /*@HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds" ,value = "4000")
    })*/
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        String result = paymentFeignService.paymentInfo_TimeOut(id);
        log.info("*******result:"+result);
        return result;
    }


    public String paymentInfo_TimeOutHandler(Integer id){
        return "消费者  线程池："+Thread.currentThread().getName()+"   系统繁忙, 请稍候再试  ,id：  "+id+"\t"+"Hystrix的消费者接入了 降级了";
    }

    public String paymentInfo_TimeOutGlobalHandler(){
        return "全局----消费者  线程池："+Thread.currentThread().getName()+"Hystrix的消费者接入了 降级了";
    }

    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        String result = paymentFeignService.paymentCircuitBreaker(id);
        log.info("*******result:"+result);
        return result;
    }
}
