package com.baidu.ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @Auther: zhuan
 * @Date: 2018/10/29 10:50
 * @Description:
 */

//自定义需要扫描的包，默认扫描到入口类所在的包
@SpringBootApplication(scanBasePackages="com.baidu.ai")
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
}
