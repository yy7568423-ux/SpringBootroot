package com.dddj;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
/**
 * @author DDDJ
 **/
@SpringBootTest
public class UserServiceTest  {
    @Autowired
    private UserService userService;

    @Test
    public void testAdd(){
        userService.add();
    }

}
