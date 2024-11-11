package com.czstudio.sdstudioprofile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author： 无知啊
 * @ProJect_Name： chzcStudio
 * @Date： 2024/11/11 13:15
 * @Description:
 * @Since version:1.0
 */

@RestController
@RequestMapping("/test")
public class demoController {
    @GetMapping()
    public String test() {
        return "hello";
    }
}
