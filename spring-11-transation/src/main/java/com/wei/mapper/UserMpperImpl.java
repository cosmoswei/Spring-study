package com.wei.mapper;

import com.wei.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author 21170
 */
public class UserMpperImpl extends SqlSessionDaoSupport implements UserMapper {


    @Override
    public List<User> selectUser() {
        User user = new User(5, "张三三", "533333");
        //addUser(user);
        deleteUser(5);
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
