package ex04;

class  Pet {
	String   name;
	void     eat() {
		System.out.println(name +"(이)가 먹는다");
	}
}

class  Dog  extends Pet {	  // Dog = Pet + Dog
	void     bark() {
		System.out.println(name +"(이)가 멈멍");
	}
}

class  Cat  extends Pet {	
	void    meow() {
		System.out.println(name +"(이)가 야옹");
	}
}

public class TestAnimalInherit {

	// 상속 : Inherit -> Java 에서는 extends 로 처리
	// 다중상속 불가능(상속은 한개만 가능) -> java, C#
	public static void main(String[] args) {
		
		Pet  pet   =  new Pet();
		pet.name   =  "뻐금이";
		pet.eat();
		
		
		Dog  dog   =  new  Dog();
		dog.name   =  "츄";
		dog.eat();
		dog.bark();
		
		
		Cat   nero  =  new Cat();
		nero.name   =  "네로";
		nero.eat();
		nero.meow();

	}

}







