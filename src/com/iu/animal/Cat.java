package com.iu.animal;

public class Cat { //public : 어디에서든 사용 가능, 제한이 없음
	
	private int age; //private : 같은 클래스 내에서만 사용이 가능
	int name; //default : 같은 패키지 내에서만 사용이 가능
	
	public void sound() {
		age=10;
		System.out.println("야옹");
	}
	
	 public Cat() {
		
	}
}
