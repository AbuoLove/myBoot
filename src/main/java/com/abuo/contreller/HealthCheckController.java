package com.abuo.contreller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HealthCheckController {
    @RequestMapping("healthCheck")
    //@ResponseBody
    public String healthCheck(){
        return "myBoot is OK";
    }
}
