package com.iu.animal;

public class Human {
	
	private int age;
	
	public void setAge(int age) { //매개변수로 받은 값을 age에 담는다
		this.age=0;
		if(0<=age && age<150) {
			this.age = age; 
		}
	}
	
	public int getAge() { 
		return this.age; //값을 외부로 보내준다
	}
	
	
	
	public void info() {
		System.out.println(this.age);
	}
	
	
	public void myPet() {
		Cat cat = new Cat();
		//cat.age=10;	private : 다른 클래스라 접근 불가능
		cat.sound();
	}
}
