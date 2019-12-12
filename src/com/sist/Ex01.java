package com.sist;

/*
 * java에서의 연산자 종류
 * 1. 산술연산자
 * 2. 관계연산자
 * 3. 논리연산자
 * 4. 단항연산자 / 3항연산자
 * 5. 배정연산자 / 단축배정연산자
 * 6. 비트연산자
 * 7. 쉬프트연산자
 */

/*
 * 1. 산술연산자
 *    - 덧셈(+), 뺄셈(-), 곱셈(*), 나눗셈(/), 나머지(%)
 */

public class Ex01 {

	public static void main(String[] args) {
		
		// 같은 자료형일 경우에는 ,로 구분하여 한 줄로 나열이 가능하다.
		int su1 = 10, su2 = 3, result = 0;
		
		// 덧셉연산
		result = su1 + su2;
		System.out.println("덧셈결과 ==> " + result);  // result ==> 13
		
		// 뺄셈연산
		result = su1 - su2;
		System.out.println("덧셈결과 ==> " + result);  // result ==> 7
		
		// 곱셈연산
		result = su1 * su2;
		System.out.println("곱셈결과 ==> " + result);  // result ==> 30
		
		// 나눗셈연산
		result = su1 / su2;
		System.out.println("나눗셈결과 ==> " + result); // result ==> 3
		
		// 나머지 연산
		result = su1 % su2;
		System.out.println("나머지결과 ==> " + result); // result ==> 1
		
		/*
		 *  나머지(%) 연산자
		 *   - 나머지를 구하는 연산자
		 *   - 홀수 짝수, 배수 등을 판별할 때 사용
		 */
		
		
	}

}
