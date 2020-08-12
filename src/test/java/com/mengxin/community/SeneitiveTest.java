package com.mengxin.community;

import com.mengxin.community.util.SensitiveFilter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author mx
 * @date 2020/4/25 - 23:16
 */

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class SeneitiveTest {

    @Autowired
    private SensitiveFilter sensitiveFilter;

    @Test
    public void testSensitiveFilter() {
        String text = "这里可以赌博，可以嫖娼，可以吸毒，可以开票，哈哈哈。";
        text = sensitiveFilter.filter(text);
        System.out.println(text);
    }
}
