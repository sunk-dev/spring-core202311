package com.spring.core.chap02;

import org.springframework.stereotype.Component;

@Component(value = "kc")
public class kimuraChef implements Chef {
    public void cook(){
        System.out.println("스시 명장 키무라 입니다.");
    }
}
