package com.three;

public class CarTest extends Car {
	public static void main(String[] args) {
		//carŬ������ �θ�Ŭ�����ο��� ���� ���볻�� �߰�
		//benz,sonata Ŭ������ carclass�� ��� �޾Ƽ� �ٵ������Ϸ�, ����
		
		SonataClass sonata= new SonataClass();
		sonata.body();
		BenzClass benz= new BenzClass();
		benz.body();
	}
}
