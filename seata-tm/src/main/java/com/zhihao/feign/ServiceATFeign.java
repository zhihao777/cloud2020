package com.zhihao.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@FeignClient(value = "seata-at")
public interface ServiceATFeign {

    /**
     * 调用at服务插入记录
     *
     * @param params - name
     * @return String
     */
    @PostMapping(value = "/at-insert")
    String insertAT(Map<String, String> params);

}