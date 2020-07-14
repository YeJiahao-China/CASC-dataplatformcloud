package com.casc.platform.Dao;

import com.casc.platform.bean.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public interface LoginDao {
    @Select("select id,username,tel,password from user where tel = #{tel} and password = #{password}")
    User doLogin(HashMap<String, String> paramMap);
    @Select("select id,username,tel,password from user where tel = #{tel} and password = #{password}")
    User queryUser(HashMap<String, String> paramMap);
}
