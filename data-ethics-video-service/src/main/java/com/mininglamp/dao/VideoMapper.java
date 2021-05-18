package com.mininglamp.dao;

import com.mininglamp.domain.Video;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Description 
 * @Author xxxx  
 * @Version 1.0
 **/

@Repository
public interface VideoMapper {

    @Select("select * from video where id=#{videoId}")
    Video findById(@Param("videoId") int videoId);


}
