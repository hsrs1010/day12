package com.one;

public class StudentTest {
	public static void main(String[] args) {
		Student stu=new Student();
		
		stu.getname("ȫ�浿");
		//ȫ�浿�� ���� ������ ����� 111 �������
		System.out.println("ȫ�浿 ��� : "+stu.getPass());
		stu.getname("ȫ���");
		System.out.println("ȫ��� ��� : "+stu.getPass());

		//ȫ����� ���� ������ ����� 222 ��õ���
	}
}
