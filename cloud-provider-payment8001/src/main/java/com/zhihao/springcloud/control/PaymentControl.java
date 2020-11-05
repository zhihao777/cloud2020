package com.zhihao.springcloud.control;

import com.zhihao.springcloud.entities.CommonResult;
import com.zhihao.springcloud.entities.Payment;
import com.zhihao.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName PaymentControl
 * @Description: TODO
 * @Author zhiHao
 * @Date 2020/7/7
 * @Version V1.0
 **/
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentControl {

    @Autowired
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping
    public CommonResult<Payment> create(@RequestBody Payment payment){

        int i = paymentService.create(payment);
        log.info("创建payment：{}",i);
        if(i>0){
            return new CommonResult(200,"创建成功",i);
        }else{
            return new CommonResult(400,"创建失败",null);
        }

    }

    @GetMapping("/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        Payment payment = paymentService.getPaymentById(id);

        if(payment != null)
        {
            return new CommonResult(200,"查询成功:",payment);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: "+id,null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("***** element:"+element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }
}
