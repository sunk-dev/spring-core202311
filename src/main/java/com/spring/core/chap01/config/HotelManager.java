package com.spring.core.chap01.config;

import com.spring.core.chap01.*;

//호텔을 운영하기 위해 필요한 의존객체를
//전담해서 생성해주는 역할
public class HotelManager {
    //쉐프를 구하는 기능
    public Chef chef(){
        return new JannChef();
    }

    //레스토랑을 계약하는 기능
    public Restaurant restaurant(){
        
        //생성자로 넣기- 이걸 사용하자
        return new WesternRestaurant(chef());
//        WesternRestaurant westernRestaurant = new WesternRestaurant();
//        westernRestaurant.setChef(chef()); //수정자(세터 주입)
//        return westernRestaurant;
    }

    //호텔을 생성하는 기능
    public Hotel hotel(){
        return  new Hotel(restaurant(),chef());
    }

}
