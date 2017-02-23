package com.nowcoder.bean;

import com.nowcoder.ToutiaoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by yby on 2017/1/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ToutiaoApplication.class)
public class HelloWorldTest {

    @Autowired
    private HelloWorld helloWorld;

    @Test
    public void output() throws Exception {

        helloWorld.output();
    }

    @Test
    public void same() throws Exception {

        helloWorld.same();
        helloWorld.say();
    }

}