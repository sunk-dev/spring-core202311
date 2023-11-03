package com.spring.core.lombok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//juni5:단위 테스트 프레임 워크-public 안됨
//juni4:같은 건데 이전 버전

class PersonTest {
    
    @Test
    void lombokTest(){
        Person person = new Person();
        person.setName("김철수");
        person.setAge(31);
        String name = person.getName();
        System.out.println("name = " + name);
        System.out.println("person = " + person);
        new Person("박영희",10);

    }

}