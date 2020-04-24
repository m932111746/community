package com.mengxin.community;

import com.mengxin.community.dao.DiscussPostMapper;
import com.mengxin.community.dao.UserMapper;
import com.mengxin.community.entity.DiscussPost;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

/**
 * @author mx
 * @date 2020/4/21 - 20:34
 */

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectUser() {
        System.out.println(userMapper.selectById(1));
    }


    @Test
    public void  testSelectPosts() {
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(149, 0, 10);
        for (DiscussPost discussPost : discussPosts) {
            System.out.println(discussPost);

        }

        int i = discussPostMapper.selectDiscussPostRows(149);
        System.out.println(i);
    }
}
