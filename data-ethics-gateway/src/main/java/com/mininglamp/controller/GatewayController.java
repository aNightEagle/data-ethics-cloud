package com.mininglamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author xxxx
 * @Version 1.0
 **/

@RestController
@RequestMapping("/gateway")
public class GatewayController {


    @RequestMapping("test")
    public String test(){

        return "gateway success！";

    }


}
