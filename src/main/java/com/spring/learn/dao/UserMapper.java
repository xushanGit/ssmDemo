package com.spring.learn.dao;

import com.spring.learn.model.User;

/**
 * Created by maxsc on 2017/7/6.
 */
public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
