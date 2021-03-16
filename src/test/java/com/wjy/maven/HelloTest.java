package com.wjy.maven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: Wan Jiangyuan
 * @Description:
 * @Date: Created in 22:19 2021/3/15
 * @E-mail: 15611562852@163.com
 */

public class HelloTest {

    @Test
    public void testHello(){
        Hello hello = new Hello();
        String results = hello.sayHello("WJY");
        assertEquals("Hello WJY!",results);
    }


}
