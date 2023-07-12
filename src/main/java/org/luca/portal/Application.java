package org.luca.portal;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "org.luca.portal", annotationClass = Mapper.class)
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //3.开始启动主程序类
        SpringApplication.run(Application.class, args);
    }
}
