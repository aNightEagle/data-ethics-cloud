package com.mininglamp.controller;

import com.mininglamp.domain.Video;
import com.mininglamp.service.SdkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description 
 * @Author zc  
 * @Version 1.0
 **/

@RestController
@RequestMapping("api/v1/sdk")
public class SdkController {



    @Autowired
    private SdkService sdkService;


    @RequestMapping("find_by_id")
    public String findById(int videoId, HttpServletRequest request){

        //方便发现请求是哪台机器

        return request.getServerName()+":" +request.getServerPort();
    }


    @PostMapping("save")
    public int save(@RequestBody  Video video){

        System.out.println(video.getTitle());

        return 1;
    }

    @RequestMapping("select_test")
    public String selectTest(HttpServletRequest request){
        System.out.println("seccess01");
        return  "seccess01";
    }



}
