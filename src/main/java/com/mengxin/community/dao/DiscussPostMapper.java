package com.mengxin.community.dao;

import com.mengxin.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author mx
 * @date 2020/4/21 - 22:01
 */

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    //@Param给参数起别名
    //如果只有一个参数，并且在<if>里使用，必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);
}
