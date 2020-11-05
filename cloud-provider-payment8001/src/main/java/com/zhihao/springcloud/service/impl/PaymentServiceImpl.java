package com.zhihao.springcloud.service.impl;

import com.zhihao.springcloud.dao.PaymentDao;
import com.zhihao.springcloud.entities.Payment;
import com.zhihao.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImpl
 * @Description: TODO
 * @Author zhiHao
 * @Date 2020/7/7
 * @Version V1.0
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
