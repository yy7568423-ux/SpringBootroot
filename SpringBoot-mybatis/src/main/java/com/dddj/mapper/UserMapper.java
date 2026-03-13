package com.dddj.mapper;

import com.dddj.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author DDDJ
 **/
@Mapper
public interface UserMapper {
    @Select("select * from t_user")
    public List<User> getAll();

}