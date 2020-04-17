package com.one;

public class ItemTrans {
	private int jpoint;

	public int getjpoint() {
		return jpoint;
	}

	public void getItem(String doing) {
//		System.out.println("행동 : " + doing);
		if (doing.equals("점프")) {
			jpoint = 1000;
		} else if (doing.equals("더블 점프")) {
			jpoint = 3000;
		} else if (doing.equals("적군킬")) {
			jpoint = 5000;
		} else {
			jpoint = 0;
		}
	}
}