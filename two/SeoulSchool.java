package com.two;

public class SeoulSchool extends School {
	public static void main(String[] args) {
		SeoulSchool ss=new SeoulSchool();
		ss.dostudy();
		ss.supercall();
	}
	public void supercall() {
		super.dostudy();
		this.dostudy();
	}
	public void dostudy() {
		System.out.println("우리학교 등교시간");
	}
}
