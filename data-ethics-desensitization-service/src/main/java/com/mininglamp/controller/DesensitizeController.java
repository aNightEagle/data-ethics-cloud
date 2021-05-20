package com.mininglamp.controller;

import com.mininglamp.domain.Video;
import com.mininglamp.domain.VideoOrder;
import com.mininglamp.service.SdkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author zc
 * @Version 1.0
 **/

@RestController
@RequestMapping("api/v1/desensitize_sdk")
public class DesensitizeController {

    @Autowired
    private SdkService sdkService;

    @RequestMapping("save")
    public Object save(int videoId){

        Video video = sdkService.findById(videoId);

        VideoOrder videoOrder = new VideoOrder();
        videoOrder.setVideoId(video.getId());
        videoOrder.setVideoTitle(video.getTitle());
        videoOrder.setCreateTime(new Date());

        videoOrder.setServerInfo(video.getServeInfo());
        return videoOrder;

    }

    int temp = 0;

    @RequestMapping("list")
    public Object list(HttpServletRequest request){


        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        temp++;
        if(temp%3 == 0){
            throw  new RuntimeException();
        }

        Map<String,String> map  = new HashMap<>();

        map.put("title1","12");
        map.put("title2","12");
        map.put("port",request.getServerPort()+"");

        return map;
    }

    @RequestMapping("select_test")
    public Object selectTest(HttpServletRequest request){
        System.out.println("seccess01");
        Map<String,Object> resultInfo = new HashMap<>();
        resultInfo.put("code","0");
        resultInfo.put("msg","访问成功");
        return resultInfo.toString();
    }

}
