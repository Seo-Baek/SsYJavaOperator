package com.sist;

/*
 *  2. 관계연산자(비교연산자)
 *  	- >= (크거나 같다), > (크다), <= (작거나 같다),
 *  	  < (작다), == (같다), != (같지 않다)
 *  	- 결과는 참 아니면 거짓으로 나옴  : boolean형으로 반환됨.
 *  	- 관계연산자는 조건식에 많이 사용되는 연산자.
 */

public class Ex02 {

	public static void main(String[] args) {

		int su1 = 10, su2 = 5;
		boolean test = false;
		
		test = (su1 >= su2);	//true
		System.out.println("su1 >= su2 결과 : " + test);

		test = (su1 > su2);		//true
		System.out.println("su1 >= su2 결과 : " + test);

		test = (su1 <= su2);	//false
		System.out.println("su1 >= su2 결과 : " + test);

		test = (su1 < su2);		//false
		System.out.println("su1 >= su2 결과 : " + test);
		
		test = (su1 == su2);	//false
		System.out.println("su1 >= su2 결과 : " + test);
		
		test = (su1 != su2);	//true
		System.out.println("su1 >= su2 결과 : " + test);
		
	}

}
