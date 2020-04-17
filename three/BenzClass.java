package com.three;

public class BenzClass extends Car {
	public void body() {
		Car car=new Car();
		car.engine();
		
		System.out.println("벤츠 바디장착"+ ","+ "생산완료");
	}
}