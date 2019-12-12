package com.sist;

/*
 * 7. 쉬프트(shift) 연산자
 * 	   - 비트열을 대상으로 왼쪽/오른쪽으로 비트를 밀어서 연산을 수행하는 연산자.
 * 	   - 왼쪽 쉬프트(<<) 	: 곱하기의 의미.
 *	   - 오른쪽 쉬프트(>>)	: 나누기의 의미.
 */

public class Ex07 {

	public static void main(String[] args) {
		
		int num1 = 10, num2 = 5;
		System.out.println(num2 << 3);
		System.out.println(num2 >> 1);

	}

}
