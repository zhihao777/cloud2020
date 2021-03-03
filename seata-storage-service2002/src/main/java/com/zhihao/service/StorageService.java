package com.zhihao.service;

/**
 * @ClassName StorageService
 * @Description: TODO
 * @Author zhiHao
 * @Date 2021/3/3
 * @Version V1.0
 **/
public interface StorageService {
    // 扣减库存
    void decrease(Long productId, Integer count);
}
