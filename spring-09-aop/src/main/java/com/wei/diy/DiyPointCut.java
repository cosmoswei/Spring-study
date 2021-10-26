package com.wei.diy;

/**
 * @author 21170
 */
public class DiyPointCut {

    public void before() {
        System.out.println("【二】===方法执行前===");
    }

    public void after() {
        System.out.println("===方法执行后====");
    }
}
