package com.polymorphism;


class Parent1{
	public void addition(int a,int b) {
		System.out.println("addition of int numbers");
	}
	
	public void addition(double d, double e) {
		System.out.println("addition of float numbers");
	}
}

class Child1 extends Parent1{
	public void addition(int a,int b) {
		System.out.println("addition of int numbers in child");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Parent1 p = new Parent1();
		p.addition(3, 7);
		p.addition(3.2, 3.7);
		
		Child1 c = new Child1();
		c.addition(1, 3);
		
		Parent1 pc = new Child1();
		pc.addition(0, 0);
		
	}
}