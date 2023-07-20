package com.constructor;

//once we create object we have to perform initialization to an object. 
//then only the object is in a position to perform properly
//Constructor is used to initialize the object, not to create object.
//The memory for the object is allocated when we call the constructor.
//Return type concept not applicable for constructor, even void is not applicable.

public class ConstructorClass {
	String name;
	int rollno;
	String subject;
	
	ConstructorClass(String name,int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	
	ConstructorClass(String name,int rollno, String subject){
		this.name = name;
		this.rollno = rollno;
		this.subject = subject;
	}
	

	public static void main(String[] args) {
		ConstructorClass c1 = new ConstructorClass("sai",100);
		ConstructorClass c2 = new ConstructorClass("krishna",200);
		ConstructorClass c3 = new ConstructorClass("krishna",300,"ECE");
		
		System.out.println(c1);
		System.out.println(c2);
		
	}
	
	//Object values can be print in output by overriding toString() method.
	public String toString() {
		return (this.name + " " + this.rollno);
	}

}
