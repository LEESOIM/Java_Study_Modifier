package com.iu.main;

import com.iu.animal.Cat;
import com.iu.animal.Human;
import com.iu.animal.Zoo;

public class Main {

	public static void main(String[] args) {
		
		//효용범위 : public > protected > default > private

		Cat cat = new Cat(); //생성자 호출해서 객체를 만든다!
		cat.sound();
//		cat.age = 5;		private : 다른 클래스라 접근 불가능
//		cat.name = "냥";		default : 다른 패키지라 접근 불가능
		
		System.out.println("-----------------");
		Human human = new Human();
//		human.age=500;		private : 같은 클래스 내에서만 사용이 가능
		human.setAge(130); //직접적으로 접근하지 않고 메서드 통해서 접근
		System.out.println(human.getAge());
		human.info(); 
		

		
		System.out.println("-----------------");
		//System이라는 클래스에 out이라는 변수가 선언되었다
		
		
		//static : 객체를 생성하지 않고 사용 가능
		System.out.println(Zoo.title); //Zoo클래스에 선언된 title
		Zoo.info();
		
		
		System.out.println("-----------------");
		Zoo zoo = new Zoo();
		zoo.getPrice(); //final : 한번 대입한 값은 변경 금지, 상수 취급(대문자)
		
		
	}

}
