package com.zhihao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName SeataOrderMainApp2001
 * @Description: TODO
 * @Author zhiHao
 * @Date 2021/3/3
 * @Version V1.0
 **/
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan({"com.zhihao.dao"})
@SpringBootApplication
public class SeataOrderMainApp2001{

    public static void main(String[] args)
    {
        SpringApplication.run(SeataOrderMainApp2001.class, args);
    }
}