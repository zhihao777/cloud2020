package com.zhihao.springcloud.service;

import com.zhihao.springcloud.entities.Payment;
import org.springframework.stereotype.Service;


public interface PaymentService {

    public String paymentInfo_OK(Integer id);

    public String paymentInfo_TimeOut(Integer id);
}
