package com.nowcoder.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by yby on 2017/1/18.
 */

@Component
@Aspect
public class testAspect {

    @Before("execution(* com.nowcoder.bean.*.*(..))")
    public void logBefore(){

        System.out.println("this is test AOP");
    }
}
