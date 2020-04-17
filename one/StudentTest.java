package com.one;

public class StudentTest {
	public static void main(String[] args) {
		Student stu=new Student();
		
		stu.getname("홍길동");
		//홍길동을 전달 했을때 비번이 111 리턴출력
		System.out.println("홍길동 비번 : "+stu.getPass());
		stu.getname("홍길순");
		System.out.println("홍길순 비번 : "+stu.getPass());

		//홍길순을 전달 했을때 비번이 222 리천출력
	}
}
