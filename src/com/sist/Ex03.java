package com.sist;

/*
 * 3. 논리연산자
 * 	  - 논리곱 : && (and) - 주어진 조건이 모두 true일 때 결과가 true가 됨. 나머지는 false가 됨.
 * 	  - 논리합 : || (or ) - 주어진 조건 중 하나라도 true이면 결과는 true 
 * 	  - 부  정 :  ! (not) - true -> false, false -> true 로 변경
 * 	  - 논리연산자는 우선적으로 관계연산자를 실행 후
 * 		  그 결과값을 가지고 논리연산자를 수행한다.
 * 	  - 크기 변환이 가능하여 가변형 연산자라고 말하기도 한다.
 */

public class Ex03 {

	public static void main(String[] args) {
		
		int su1 = 10, su2 = 7;
		
		//논리곱
		boolean res1 = (su1 >= 7) && (su2 >= 5);	//true 	&& true 	==> true
		boolean res2 = (su1 >= 7) && (su2 < 5);		//true 	&& false 	==> false
		boolean res3 = (su1 < 7) && (su2 >= 5);		//false && true 	==> false
		boolean res4 = (su1 < 7) && (su2 < 5);		//false && false 	==> false

		//논리합
		boolean res5 = (su1 >= 7) && (su2 >= 5);	//true 	|| true 	==> true
		boolean res6 = (su1 >= 7) && (su2 < 5);		//true 	|| false 	==> true
		boolean res7 = (su1 < 7) && (su2 >= 5);		//false || true 	==> true
		boolean res8 = (su1 < 7) && (su2 < 5);		//false || false 	==> false
		
		
		//결과 출력
		System.out.println("res1 ==> " + res1);
		System.out.println("res2 ==> " + res2);
		System.out.println("res3 ==> " + res3);
		System.out.println("res4 ==> " + res4);
		
		System.out.println("res5 ==> " + res5);
		System.out.println("res6 ==> " + res6);
		System.out.println("res7 ==> " + res7);
		System.out.println("res8 ==> " + res8);
		
		
		
	}

}
