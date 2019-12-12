package com.sist;

/*
 * 6. 비트연산자
 * 		- 비트(0 or 1)를 이용하여 연산하는 연산자.
 * 		- & (and) : 두 조건이 참인 경우 1을 반환, 그 외에는 0을 반환
 * 		- | (or)  : 두 조건 중 하나만 참이면 1을 반환, 모두 거짓이면 0을 반환 (모두 참이어도 1 반환)
 * 		- ^ (xor) : 두 개의 관계연산 결과가 서로 다른 경우에만 1을 반환,
 * 					나머지 관계연산의 결과가 같은 경우에는 0을 반환
 */

public class Ex06 {

	public static void main(String[] args) {
		
		int num1 = 10, num2 = 5;
		
		//and 연산
		int result = num1 & num2;
		System.out.println("and result ==> " + result);
		
		//or 연산
		result = num1 | num2;
		System.out.println("or result ==> " + result);
		
		//xor 연산
		result = num1 ^ num2;
		System.out.println("xor result ==> " + result);
		
		num2 = 8;
		result = num1 ^ num2;
		System.out.println("xor result ==> " + result);
		
		/*
         * 8 을 2진수로 고치면 0100(2)
         * 10은 2진수로 고치면 0110(2)
         * 두개의 이진수를 xor로 비교하면 세번째 열만 다르기 때문에 0010(2)이 결과값으로 나옴
         * 0010(2)는 10진수로 고치면 2
         */
	}

}
