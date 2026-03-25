package ex05;

abstract class Pet {   // 한개이상의 abstract 메소드가 있다면 abstract class
	String   name;
	void     eat() {
		System.out.println(name + "(이)가 먹는다");
	}
	abstract void     sound();   // 함수의 {} 가 없으면 abstract 필수
}

class Dog extends Pet {

	// 코딩이 없는 함수를 상속받으면 반드시 자식이 코딩을 구현해야한다 -  재정의(override)
	// Add Unimplemented method 
	@Override    // 재정의
	void sound() {
		System.out.println(name + "(이)가 멍멍");		
	}
	
}

class Cat extends Pet {

	@Override
	void sound() {
		System.out.println(name + "(이)가 애옹");		
	}
	 	
}

public class TestAnimal {

	public static void main(String[] args) {

		// Pet pet    = new Pet();  // 오류 :abstract 가 있으면 new 불가능
		
		Dog  dog1  = new Dog();
		work(dog1, "츄");
//		dog1.name  = "츄";
//		dog1.eat();
//		dog1.sound();
		
		Cat  cat1  = new Cat();
		work(cat1, "네로");
//		cat1.name  = "네로";
//		cat1.eat();
//		cat1.sound();

	}

	// 방법2
	// work 한개로 통일
	// 부모클래스는  자식클래스 담을수 없다   
	//    Pet pet = new Pet(); Dog dog1 = pet; // 문법적인 오류
	// 자식클래스는 부모클래스 담을수 있다    Pet pet = dog1; Pet pet = cat1; (oK)
	private static void work(Pet pet, String name) {
		pet.name = name;
		pet.eat();
		pet.sound();		
	}
	
	

	// ------------------------------------------------
	/*
	// 방법 1 : ㅎ마수의 오버로드 기능 활용
	private static void work(Dog dog1, String name) {
		dog1.name  = name;
		dog1.eat();
		dog1.sound();		
	}

	private static void work(Cat cat1, String name) {
		cat1.name  = name;
		cat1.eat();
		cat1.sound();		
	}
	*/ 
	//---------------------------------------------------

}







