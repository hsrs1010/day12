package com.one;

public class jumpTest {
	public static void main(String[] args) {
		//������� ���ڸ� �����ϸ� ����Ʈ1000�� ȹ��(���� 1000)
		//���� ������� ���ڸ� �����ϸ� ����Ʈ3000ȹ��(�������� 3000)
		// ���� ų��� ���ڸ� �����ϸ� ����Ʈ5000ȹ��(���� ų 5000)
		//��Ÿ ����
		ItemTrans its=new ItemTrans();
		
		its.getItem("����");
		System.out.println("���� ����Ʈ : "+its.getjpoint());
		its.getItem("���� ����");
		System.out.println("���� ���� ����Ʈ : "+its.getjpoint());
		its.getItem("����ų");
		System.out.println("����ų : "+its.getjpoint());
		its.getItem("��Ÿ");
		System.out.println("��Ÿ : "+its.getjpoint());
//		������ ����Ʈ ��� :
		
	}
}
