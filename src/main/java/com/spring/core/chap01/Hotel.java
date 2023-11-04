package com.spring.core.chap01;

public class Hotel {

    //의존 관계: 어떤 갹체가 어떤 객체를 필요로 하는것.
    //레스토랑 예약기능
    private Restaurant restaurant;
    private  Chef headChef;

    public Hotel(Restaurant restaurant, Chef headChef) {
        this.restaurant = restaurant;
        this.headChef = headChef;
    }

    public void reserve(){
        //예약을 수행하려면 레스토랑에 연락해서 예약을 해야함.
        System.out.printf("우리 호텔의 레스토랑은 %s 입니다. 헤드 셰프는 %s 입니다"
                ,restaurant.getClass().getSimpleName()
                ,headChef.getClass().getSimpleName());

        restaurant.order();


    }

}
