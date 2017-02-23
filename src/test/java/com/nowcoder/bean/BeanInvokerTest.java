package com.nowcoder.bean;

import com.nowcoder.ToutiaoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by yby on 2017/1/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ToutiaoApplication.class)
public class BeanInvokerTest {

    @Autowired
    BeanInvoker beanInvoker;

    @Test
    public void say() throws Exception {

        List<Integer> list = new ArrayList<>();
        for (Integer ii : list){
            System.out.println(ii);
        }

        beanInvoker.say2();
    }

}