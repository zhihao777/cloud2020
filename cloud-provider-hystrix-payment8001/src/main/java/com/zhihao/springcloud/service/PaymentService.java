package com.zhihao.springcloud.service;

import com.zhihao.springcloud.entities.Payment;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


public interface PaymentService {

    public String paymentInfo_OK(Integer id);

    public String paymentInfo_TimeOut(Integer id);

    public String paymentCircuitBreaker(Integer id);
}
