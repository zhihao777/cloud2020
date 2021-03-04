package com.zhihao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName SeataTMApplication
 * @Description: TODO
 * @Author zhiHao
 * @Date 2021/3/4
 * @Version V1.0
 **/
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SeataTMApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(SeataTMApplication.class, args);
    }
}
