package com.qsl.demo.impl;

import com.qsl.demo.api.IPayServer;

/**
 * @Author qiaoshiling
 * @Description TODO
 * @Date 2019/7/22 15:43
 **/
public class PayServer implements IPayServer {
    @Override
    public String pay(String str) {
        return "HELLO DUBBO "+str;
    }
}
