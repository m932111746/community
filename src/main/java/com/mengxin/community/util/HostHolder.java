package com.mengxin.community.util;

import com.mengxin.community.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author mx
 * @date 2020/4/24 - 22:30
 * 持有用户的信息，用于代替session对象
 */

@Component
public class HostHolder {

    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setUser(User user) {
        users.set(user);
    }

    public User getUser() {
        return users.get();
    }

    public void clear() {
        users.remove();
    }
}
