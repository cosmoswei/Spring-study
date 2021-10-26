package com.wei.dao;

public class UserOrcle implements UserDao{
    @Override
    public void getUser() {
        System.out.println("Orcle获取用户数据");
    }
}
