package com.zhihao.controller;

import com.zhihao.service.TccService;
import com.zhihao.service.impl.TccServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TmController
 * @Description: TODO
 * @Author zhiHao
 * @Date 2021/3/4
 * @Version V1.0
 **/
@RestController
public class TccController {

    @Autowired
    TccService service;

    @PostMapping("/tcc-insert")
    public String insertTcc(@RequestBody Map<String, String> params) {
        return service.insert(params);
    }


}