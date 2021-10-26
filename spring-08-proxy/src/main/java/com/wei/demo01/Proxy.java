package com.wei.demo01;

public class Proxy {
    private Host host;

    public Proxy() {

    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        host.rent();
        seeHouse();
        free();
        heTong();
    }

    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    public void free() {
        System.out.println("收中介费");
    }

    public void heTong() {
        System.out.println("签合同");
    }
}
