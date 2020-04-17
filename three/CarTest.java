package com.three;

public class CarTest extends Car {
	public static void main(String[] args) {
		//car클래스는 부모클래스로엔진 장착 공통내용 추가
		//benz,sonata 클래스는 carclass를 상속 받아서 바디장착완료, 생산
		
		SonataClass sonata= new SonataClass();
		sonata.body();
		BenzClass benz= new BenzClass();
		benz.body();
	}
}
