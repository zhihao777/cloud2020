package com.zhihao.springcloud.service;

import com.zhihao.springcloud.entities.Payment;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
