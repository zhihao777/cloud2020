package com.zhihao.springcloud.service.impl;

import com.zhihao.springcloud.entities.Payment;
import com.zhihao.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName PaymentServiceImpl
 * @Description: TODO
 * @Author zhiHao
 * @Date 2020/11/5
 * @Version V1.0
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    //成功
    public String paymentInfo_OK(Integer id){
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_OK,id：  "+id+"\t"+"哈哈哈"  ;
    }

    //失败
    public String paymentInfo_TimeOut(Integer id){
        int timeNumber = 3;
        try { TimeUnit.SECONDS.sleep(timeNumber); }catch (Exception e) {e.printStackTrace();}
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_TimeOut,id：  "+id+"\t"+"呜呜呜"+" 耗时(秒)"+timeNumber;
    }
}
