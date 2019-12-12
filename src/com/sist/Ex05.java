package com.sist;

/*
 * 5. 배정연산자 / 단축배정연산자
 * 	  - 배정연산자
 * 		형식) 변수 = 변수 or 값 or 수식
 * 
 * 	 	 - 좌변에는 항상 변수명이 온다.
 * 		 - 우변에는 숫자, 변수, 수식이 온다.
 * 
 * 	  - 단축배정연산자
 * 		 - 배정연산자를 간편하게 사용하는 연산자.
 */

public class Ex05 {

	public static void main(String[] args) {

		int a = 10, b = 27, result = 0;
		a = b; // 변수 = 변수
		System.out.println("a ==> " + a);
		
		a = b + 29; // 변수 = 수식
		System.out.println("a ==> " + a);
		
		System.out.println("");
		
		result = result + b; // result -> 누적변수 : 자기자신에 무엇을 더해서 자기자신으로 돌아오는 것(누적)
		System.out.println("result ==> " + result);
		
		result += b; // 단축배정연산자 => 좌항이 누적변수일 때만 쓸 수 있다!, 사칙연산 전체 가능
		System.out.println("result ==> " + result);
	
		System.out.println("");
		
		int su = 15;
		
		System.out.println("su ==> " + (su += 5));	// su = su + 5;
		System.out.println("su ==> " + (su -= 5));	// su = su - 5;
		System.out.println("su ==> " + (su *= 5));	// su = su * 5;
		System.out.println("su ==> " + (su /= 5));	// su = su / 5;
		System.out.println("su ==> " + (su %= 5));	// su = su % 5;
	}

}
