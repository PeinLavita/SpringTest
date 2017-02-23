package com.nowcoder.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by yby on 2017/1/16.
 */

@Component
@Scope("prototype")
public class Person {
    public String name = "yby";

}
