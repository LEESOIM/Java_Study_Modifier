package com.iu.ex1;

public class Ex1Main {

	public static void main(String[] args) {

		//객체 생성
//		Iu iu = new Iu();
//		iu.setName("iu"); 
//		iu.setAge(30);
//		String name = iu.getName();

//		System.out.println(name);
//		System.out.println(iu.getAge());
//		private -> 다른 클래스에서 사용을 못하니까 메서드(세터게터)를 이용한다
		
		
		//싱글톤(디자인 패턴, MVC2)
		//생성자에 private 했을 경우 -> 객체를 만들지 못함
		Iu iu = Iu.getInstance();
		iu.setName("iu"); 
		iu.setAge(30);
		String name = iu.getName();

		System.out.println(name);
		System.out.println(iu.getAge());
		System.out.println(iu);
		System.out.println("-----------");
		
		Iu iu2 = Iu.getInstance();
		System.out.println(iu2.getName());
		System.out.println(iu2.getAge());
		System.out.println(iu2);
		
		//무분별한 객체 생성을 막기 위해 주소값만 가져와서 쓰도록 한다
		

	}

}
