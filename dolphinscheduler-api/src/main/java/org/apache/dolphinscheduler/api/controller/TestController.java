package org.apache.dolphinscheduler.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linyong
 * @date 2020/7/13 11:45
 * @description
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("hello");
        return "hello";
    }
}
