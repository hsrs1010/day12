package com.one;

public class ItemTrans {
	private int jpoint;

	public int getjpoint() {
		return jpoint;
	}

	public void getItem(String doing) {
//		System.out.println("�ൿ : " + doing);
		if (doing.equals("����")) {
			jpoint = 1000;
		} else if (doing.equals("���� ����")) {
			jpoint = 3000;
		} else if (doing.equals("����ų")) {
			jpoint = 5000;
		} else {
			jpoint = 0;
		}
	}
}