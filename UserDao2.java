package com.xs.dao;

public class UserDao2 implements IUserDao {

    @Override
    public void getUser() {
        System.out.println("这里应该放mybatis的对数据库进行的操作....2");
    }
}
