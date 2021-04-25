package com.dscy.pasture.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/usertest")
@RestController
public class UserControllerApi {

    // http://localhost:8080/pasture/api/usertest/hello?1

    @RequestMapping("/hello")
    public String hello(@RequestParam("id") Integer id){

        return "hello World"+id;
    }
}
