package com.wei.demo04;

import com.wei.demo02.UserService;
import com.wei.demo02.UserServiceImpl;

/**
 * @author 21170
 */
public class Client {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();

        //连接代理
        proxyInvocationHandler.setTarget(userService);

        //注入代理
        UserService proxy = (UserService) proxyInvocationHandler.getProxy();

        proxy.query();
    }
}