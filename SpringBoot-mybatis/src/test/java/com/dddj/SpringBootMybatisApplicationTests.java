package com.dddj;

import com.dddj.domain.User;
import com.dddj.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootMybatisApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {

        List<User> list = userMapper.getAll();
        for (User user : list) {
            System.out.println(user);
        }
    }

}
