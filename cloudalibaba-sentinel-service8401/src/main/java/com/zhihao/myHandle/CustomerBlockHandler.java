package com.zhihao.myHandle;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zhihao.springcloud.entities.CommonResult;

/**
 * @ClassName CustomerBlockHandler
 * @Description: TODO
 * @Author zhiHao
 * @Date 2021/3/1
 * @Version V1.0
 **/
public class CustomerBlockHandler {

    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler");

    }
}