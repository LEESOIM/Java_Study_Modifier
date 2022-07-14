package com.iu.animal;

public class Zoo {
	//멤버변수
	//접근지정자 [그외지정자] 데이터타입 변수명;
	
	//클래스변수(그외지정자를 써준다)
	public static String title="사파리";		//static : 객체를 생성하지 않고 사용 가능

	//멤버(인스턴스)변수				// 객체를 생성해야 사용 가능
	public final int PRICE=50000; 	//final : 한번 대입한 값은 변경 금지, 상수 취급(대문자)

	
	
	
	
	//멤버메서드
	//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수선언]){};
	
	//클래스메서드(그외지정자를 써준다)
	public static void info() {
		System.out.println("Static Method");
		System.out.println(Zoo.title);
//		System.out.println(price); //객체가 생성되어야 한다 info()->main 실행시 객체생성전이므로 오류 
//		Zoo.getPrice(); //객체가 생성되어야 한다
		
//		(실행순서 : static -> main -> 객체생성)
	}
	
	
	
	//멤버(인스턴스)메서드
	public void getPrice() {
		System.out.println(PRICE);
		System.out.println(Zoo.title);
		Zoo.info();
	}
}
