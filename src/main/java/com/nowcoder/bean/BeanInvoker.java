package com.nowcoder.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by yby on 2017/1/16.
 */

@Component
public class BeanInvoker {

    @Autowired
    List<BeanInterface> list;

    @Autowired
    Map<String, BeanInterface> map;

    @Autowired
    @Qualifier("beanImplTwo")
    private BeanInterface beanInterface;

    public void say(){
        if (list != null){
            for (BeanInterface bean : list){
                System.out.println(    bean.getClass().getName());
            }
        }else{
            System.out.println("this is null");
        }
    }

    public void say2(){
        if (map != null){
            int i=0;
            for (Map.Entry entry : map.entrySet()){
                System.out.println(Integer.toString(i++) + entry.getKey() + entry.getValue().getClass().getName());
            }
        }else{
            System.out.println("this is null");
        }

        System.out.println(beanInterface.getClass().getName());
    }
}
