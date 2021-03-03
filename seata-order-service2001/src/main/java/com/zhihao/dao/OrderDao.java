package com.zhihao.dao;

import com.zhihao.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName OrderDao
 * @Description: TODO
 * @Author zhiHao
 * @Date 2021/3/3
 * @Version V1.0
 **/
@Mapper
public interface OrderDao
{
    //新建订单
    void create(Order order);

    //修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}


