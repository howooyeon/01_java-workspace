package com.hw2.model.vo;

public class Circle extends Point {
	private int radius;

	public Circle() {

	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		super.draw();
		double area = Math.PI * radius * radius;
		double round = Math.PI * radius * 2;
		System.out.printf("원의 면적 : %.1f \n", area);
		System.out.printf("원의 둘레 : %.1f \n", round);
	}

}
