package com.two;

public class VarTest {
	static int x;
	static int y;
	boolean flag;

	public static void main(String[] args) {
		int a, b;
		// �ʱ�ȭ ���� ���� �ʵ带 ���
		VarTest vt=new VarTest();
		System.out.println(x + " , " + y);
		vt.print();
	}

	public void print() {
		int a=3,b=5;
		System.out.println(x + " , " + y);
		System.out.println("flag : "+flag);
		System.out.println(a + " , " + b);
	}
}
