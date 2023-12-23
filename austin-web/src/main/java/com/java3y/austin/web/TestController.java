package com.java3y.austin.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 3y
 * @date 2022/6/5
 */

@RestController
public class TestController {

    @RequestMapping("/test")
    private String test() {
        return "hello";
    }
}
