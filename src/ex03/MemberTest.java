package ex03;

import java.time.LocalDate;

/* RESCENE
 원이  리브 미나미 메이 제나
 2004  2006 2006   18   17 
 리더  보컬 보컬   랩   보컬
 */
class  GMember  {
	// Fields : private
	private   String  name;
	private   int     bYear;
	private   String  role;
	
	// 객체 지향 언어의 특징
	// 다형성 :  polymophism
	// 1. OverLoading - 같은 이름의 생성자나 함수가 (인자가 다른) 여러개 있어요
	// Constructor 생성자 : 객체를 생성 (new) 할때 실행되는 명령
	
	// 기본 생성자 : 인자없는 생성자 , NoArgsConstructor
	public GMember() {
		System.out.println("Hi 방가...");
	}
	
	// 모든 인자있는 생성자, AllArgsConstructor  
	public GMember(String name, int bYear, String role) {
		this.name   =  name;
		if(bYear <= 1910)
			bYear = LocalDate.now().getYear();
		this.bYear  =  bYear;
		this.role   =  role;
	}
	
	// method : public
	public void info() {		
		int age = LocalDate.now().getYear() - bYear;
		System.out.printf("%s %d년 (%d세) %s\n", 
				name, bYear, age, role);
	}
}

public class MemberTest {
    // null  널 : 변수를 만들었으나 사용한적 없다 
	// ""    빈문자열 empty string
	
	// 모두 대문자 : Ctrl+Shift+x
	// 모두 소문자 : Ctrl+Shift+y
	public static void main(String[] args) {
		/*
		GMember  r  =  new GMember();
		System.out.println(r);
		r.name      = "원이";
		r.info();
		GMember  r2 = null;
		System.out.println(r2);
		*/ 
		
		GMember  r0 = new GMember();
		// r1.name     = "원이"; 
		  // 오류 : private 변수를 . 으로 직접 사용했다  
		  // The field GMember.name is not visible
		
		// private 변수에 값을 넣는 방법 2가지
		// 1. 생성자를 이용
		GMember  r1 = new GMember("원이", 2004, "리더");
		 r1.info();
		
		// 2. Getter / Setter 를 사용 

	}

}







