package ex03;

class  Dog {
	String   name;
	void     eat() {
		System.out.println(name +"(이)가 먹는다");
	}
	void     bark() {
		System.out.println(name +"(이)가 멈멍");
	}
}

class  Cat {
	String  name;
	void    eat() {
		System.out.println(name +"(이)가 먹는다");
	}
	void    meow() {
		System.out.println(name +"(이)가 야옹");
	}
}

public class TestAnimal {

	public static void main(String[] args) {
		Dog   chu   =  new Dog();   
		   // new Dog() 생성자호출 -> 생성자가 없다 : 자바가 기본 생성자를 생성해준다
		chu.name    = "츄";
		chu.eat();
		chu.bark();
		
		Cat   nero  =  new Cat();
		nero.name   =  "네로";
		nero.eat();
		nero.meow();

	}

}









