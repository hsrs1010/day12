package com.two;

class point {
	private int x, y;

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// ÁÂÇ¥ Ãâ·Â
	public void showpoint() {
		System.out.println(x + "," + y);
	}
}

class colorpoint extends point {
	private String color;

	public void setColor(String color) {
		this.color = color;
	}

	public void showcolorpoint() {
		System.out.print(color+" ");
		showpoint();
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		point p = new point();
		p.set(1, 2);
		p.showpoint();
		
		colorpoint cp=new colorpoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showcolorpoint();
	}
}
