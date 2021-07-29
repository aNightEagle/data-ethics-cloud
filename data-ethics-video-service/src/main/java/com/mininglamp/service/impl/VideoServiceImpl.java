package com.mininglamp.service.impl;

import com.mininglamp.dao.VideoMapper;
import com.mininglamp.domain.Video;
import com.mininglamp.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 
 * @Author xxxx  
 * @Version 1.0
 **/

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public Video findById(int videoId) {
        return videoMapper.findById(videoId);
    }

}
