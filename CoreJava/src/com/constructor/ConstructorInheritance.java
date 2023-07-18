package com.constructor;

public class ConstructorInheritance {

	public static void main(String[] args) {
		new Parent();
		new Child();
		new Child("sai");
		new Child(200);
		new Parent(300);
	}

}

class Parent{
	Parent(){
		System.out.println("Parent class Constructor");
	}
	
	Parent(int i){
		System.out.println("Parent class argument constructor");
	}
}

class Child extends Parent{
	Child(){
		super();
		System.out.println("Child class Constructor");
	}
	
	Child(String name){
		this(500);
		System.out.println("child first argument constructor");
	}
	
	Child(int i){
		System.out.println("child second argument constructor");
	}
}

