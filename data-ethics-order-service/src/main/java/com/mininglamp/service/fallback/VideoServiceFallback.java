package com.mininglamp.service.fallback;

import com.mininglamp.domain.Video;
import com.mininglamp.service.VideoService;
import org.springframework.stereotype.Service;

/**
 * @Description 
 * @Author xxxx  
 * @Version 1.0
 **/

@Service
public class VideoServiceFallback implements VideoService {
    @Override
    public Video findById(int videoId) {

        Video video = new Video();
        video.setTitle("这个是Fallback里面");

        return video;
    }

    @Override
    public int save(Video video) {
        return 0;
    }
}
