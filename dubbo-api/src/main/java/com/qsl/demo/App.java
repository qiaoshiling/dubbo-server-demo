package com.qsl.demo;

import org.apache.dubbo.container.Main;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        Main.main(new String[]{"spring","log4j"});
        System.in.read();
    }
}
