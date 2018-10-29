package com.baidu.ai.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


/**
 * @Auther: zhuan
 * @Date: 2018/10/29 10:50
 * @Description:
 */

//@RestController注解能够使项目支持Rest
@RestController
@SpringBootApplication
//表示该controller类下所有的方法都公用的一级上下文根
@RequestMapping(value = "/TextDiscern")

public class TextDiscernController {
	@RequestMapping("/hello")
    public String index() {
    /**
     *
     * 功能描述: 
     *
     * @param: []
     * @return: java.lang.String
     * @auther: zhuan
     * @date: 2018/10/29 10:50
     */
	    
        return "Hello World";
    }
}
