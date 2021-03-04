package com.zhihao.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@FeignClient(value = "seata-tcc")
public interface ServiceTCCFeign {

    /**
     * 往tcc服务插入一条记录
     *
     * @param params -name
     * @return String
     */
    @PostMapping(value = "/tcc-insert")
    String insertTCC(Map<String, String> params);

}
