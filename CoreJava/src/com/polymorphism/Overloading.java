package com.polymorphism;


class Parent{
	public void addition(int a,int b) {
		System.out.println("addition of int numbers");
	}
	
	public void addition(float a, float b) {
		System.out.println("addition of float numbers");
	}

	public void addition(double d, double e) {
		System.out.println("addition of float numbers");
	}
}

class Child extends Parent{
	public void addition(int a,int b,int c) {
		System.out.println("addition of three int numbers");
	}
}

public class Overloading {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.addition(3, 7);
		p.addition(3.2, 3.7);
		
		Child c = new Child();
		c.addition(1, 3, 4);
		
		Parent pc = new Child();
		pc.addition(3, 4);
		
	}

}
