package ex04;

import java.time.LocalDate;

/* RESCENE
원이  리브 미나미 메이 제나
2004  2006 2006   2008 2009 
리더  보컬 보컬   랩   보컬
*/

class GirlMember {
	// fields
	private  String  name;
	private  int     bYear;
	private  String  role;
	
	// constructor
	public GirlMember(String name, int bYear, String role) {
		this.name = name;
		this.bYear = bYear;
		this.role = role;
	}
	
	// Method
	public  void  info() {
		int  age  = LocalDate.now().getYear() - this.bYear ; 
		System.out.printf("%s %d년생 (%d살) %s\n", 
				name, bYear, age, role);
	}

	
}

public class MemberTest {
	/* RESCENE
	원이  리브 미나미 메이 제나
	2004  2006 2006   2008 2009 
	리더  보컬 보컬   랩   보컬
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GirlMember  resc1 = new GirlMember("원이", 2004, "리더");
		resc1.info();
		GirlMember  resc2 = new GirlMember("리브", 2006, "보컬");
		resc2.info();
		GirlMember  resc3 = new GirlMember("미나미", 2006, "보컬");
		resc3.info();
		GirlMember  resc4 = new GirlMember("메이", 2008, "랩");
		resc4.info();
		GirlMember  resc5 = new GirlMember("제나", 2009, "보컬");
		resc5.info();
		System.out.println();
		
		// 객체배열로 저장해서 처리
		// 1. 먼저 저장할 배열을 인원수에 맞게 준비
		GirlMember [] rescArr =  new GirlMember[5]; // 배열 생성   
		
		rescArr[0]  =   new GirlMember("원이",   2004, "리더");   // == resc1
		rescArr[1]  =   new GirlMember("리브",   2006, "보컬");   // == resc2
		rescArr[2]  =   new GirlMember("미나미", 2006, "보컬");
		rescArr[3]  =   new GirlMember("메이",   2008, "랩");
		rescArr[4]  =   new GirlMember("제나",   2009, "보컬");
		
		for (int i = 0; i < rescArr.length; i++) {
			rescArr[i].info();
		}
		/*
		rescArr[0].info();
		rescArr[1].info();
		rescArr[2].info();
		rescArr[3].info();
		rescArr[4].info();
		*/
	}

}




