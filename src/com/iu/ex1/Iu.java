package com.iu.ex1;

public class Iu {

	private String name; 
	private int age;
	
	
	private Iu() { //기본 생성자
		//private : 같은 클래스 내에서만 사용이 가능 -> 객체를 만들지 못함!!!
	}
	
	
	private static Iu iu = null;
	
	//클래스메서드 -> 객체를 생성하지 않고 사용 가능
	public static Iu getInstance() { 
		if(Iu.iu == null) { //주소값이 없다면 객체생성하라
			Iu.iu = new Iu();
		}
		return Iu.iu;
	}
	
	
	
	
	
	
	//Setter
	//public void set변수명(데이터타입 변수명){};
	
	//Getter
	//public 리턴타입 get변수명(){};
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
