
package com.prmt.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
    @RequestMapping("/getString")
    public String getString()
    {
        return "Hello World";
    }
}