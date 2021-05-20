package com.mininglamp.service.impl;

import com.mininglamp.dao.SdkMapper;
import com.mininglamp.domain.Video;
import com.mininglamp.service.SdkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 
 * @Author zc  
 * @Version 1.0
 **/

@Service
public class SdkServiceImpl implements SdkService {

    @Autowired
    private SdkMapper sdkMapper;



}
