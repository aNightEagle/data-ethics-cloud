package com.mininglamp.service;

import com.mininglamp.domain.Video;
import com.mininglamp.service.fallback.SdkServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@FeignClient(value = "data-ethics-sdk-service" ,fallback = SdkServiceFallback.class)
public interface SdkService {

    @GetMapping("/api/v1/video/find_by_id")
    Video findById(@RequestParam("videoId") int videoId);


    @PostMapping("/api/v1/video/save")
    int save(@RequestBody Video video);

}
