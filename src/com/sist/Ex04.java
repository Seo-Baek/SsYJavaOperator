package com.sist;

/*
 * 4. 이항연산자 / 단항연산자 / 3항연산자
 * 	  - 이항연산자 : 2개의 항을 대상으로 연산을 수행
 * 	  - 단항연산자 : 1개의 항을 대상으로 연산을 수행
 * 	  - 삼항연산자 : 3개의 항을 대상으로 연산을 수행
 */

public class Ex04 {

	public static void main(String[] args) {
		
		// 단항연산자 (++ , --)
		int su1 = 10, su2 = 10;
		
		System.out.println(++su1); //11
		System.out.println(su2--); //9?? No!!
		System.out.println(su2);   //9! 어예~
		// 단항연산자가 뒤에 붙으면 기능을 실행하고 연산한다.
		
		/*
		 * 단항연산자(++, --) 
		 * - 전위연산자 : 연산자가 변수명 앞에 온다 (++su1)
		 * 			     변수의 값을 하나 증가 혹은 감소시키고 난 후 출력
		 * - 후위연산자 : 연산자가 변수명 뒤에 온다 (su2--)
		 * 			     변수의 값을 출력 후 값을 하나 증가 혹은 감소시킨다.
		 */
		
		System.out.println("");
		
		int num1 = 10, num2 = 20;
		System.out.println(++num1 + num2++); // 11 + 20 ==> 31;
		System.out.println((++num1 % 3) + (num1 * ++num2));
		/*
		 * 33번 라인 : num1 = 11, num2 = 21로 종료
		 * 34번 라인 : num1 = 12, num2 = 22로 선증가
		 * 			나머지 연산으로 첫항 값은 0 + 후항의 값 264 ==> 264!
		 */
		
		System.out.println("");
		
		/*
		 * 삼항연산자
		 * 형식)
		 * 		(조건) ? 수식1 : 수식2
		 * 				=> 수식1 : 해당 조건이 참인 경우 실행문.
		 * 				=> 수식2 : 해당 조건이 거짓인 경우 실행문.
		 * - 간단하게 조건문 대신 사용할 수 있는 연산자
		 */
		
		int num3 = 10, num4 = 20;
		int max = (num3 > num4) ? num3 : num4;
		String result = (num3 > num4) ? "num3 값이 크다." : "num4 값이 크다.";
		
		System.out.println("더 큰 값은 " + max);
		System.out.println("더 큰 값은 " + result);
		
		// 데이터베이스와 연결
		// 키보드로 데이터를 입력을 받자.
		String id = args[0];
		String pwd = args[1];
		
		// equals() : 문자열이 같은지 틀린지를 비교하는 메소드, 결과값은 boolean형 반환
		String login =
		(id.equals("hong")) && (pwd.equals("1234")) ? "로그인 성공" : "로그인 실패";
		System.out.println("로그인 결과 ==> " + login);
		
	}

}
