package com.dddj;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author DDDJ
 **/
@Component//表示这个类被Spring管理
@ConfigurationProperties(prefix = "person") //不设置前缀，自动注入第一个name，age则为默认值0，设置前缀，自动注入name和age
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private int age;
}
