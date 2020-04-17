package com.three;

public class SonataClass extends Car{
	public void body() {
		Car car=new Car();
		car.engine();
		
		System.out.println("소나타 바디장착"+ ","+ "생산완료");
	}
}
