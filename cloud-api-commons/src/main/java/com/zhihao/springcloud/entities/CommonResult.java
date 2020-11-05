package com.zhihao.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName CommonResult
 * @Description: TODO
 * @Author zhiHao
 * @Date 2020/7/7
 * @Version V1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> implements Serializable {
    private Integer code;
    private String massage;
    private T data;
    public CommonResult(Integer code,String massage){
        this(code,massage,null);
    }
}
