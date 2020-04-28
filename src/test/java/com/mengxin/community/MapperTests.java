package com.mengxin.community;

import com.mengxin.community.dao.DiscussPostMapper;
import com.mengxin.community.dao.LoginTicketMapper;
import com.mengxin.community.dao.MessageMapper;
import com.mengxin.community.dao.UserMapper;
import com.mengxin.community.entity.DiscussPost;
import com.mengxin.community.entity.LoginTicket;
import com.mengxin.community.entity.Message;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;

import java.util.Date;
import java.util.List;

/**
 * @author mx
 * @date 2020/4/21 - 20:34
 */

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTests {

    @Autowired
    private LoginTicketMapper loginTicketMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Autowired
    private MessageMapper messageMapper;

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

    @Test
    public void testInsertLoginTicket() {
        LoginTicket loginTicket = new LoginTicket();
        loginTicket.setUserId(101);
        loginTicket.setTicket("abc");
        loginTicket.setStatus(0);
        loginTicket.setExpired(new Date(System.currentTimeMillis() + 1000 * 60 * 10));
        loginTicketMapper.insertLoginTicket(loginTicket);
    }

    @Test
    public void testSelectLetters() {
        List<Message> messages = messageMapper.selectConversations(111, 0, 20);
        for (Message message : messages) {
            System.out.println(message);
        }

        int count = messageMapper.selectConversationCount(111);
        System.out.println(count);

        List<Message> list = messageMapper.selectLetters("111_112", 0, 10);
        for (Message l : list) {
            System.out.println(l);
        }

        int i = messageMapper.selectLetterCount("111_112");
        System.out.println(i);

        int i1 = messageMapper.selectLetterUnReadCount(131, "111_131");
        System.out.println(i1);
    }


}
