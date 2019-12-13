package practise;

public class Problem04_02 {

	public static void main(String[] args) {
		// 1. 키보드로 임의의 숫자 4자리를 입력을 받는다.
		int num = Integer.parseInt(args[0]); //8762
		
		// 2. 화폐 별 수량을 확인
		int oc,c,ob,b,os, s, i; //화폐변수
		int res; //나머지변수
		
		oc = num / 5000;
		res = num % 5000;
		c = res / 1000;
		res = res % 1000;
		ob = res / 500;
		res = res % 500;
		b  = res / 100;
		res = res % 100;
		os = res / 50;
		res = res % 50;
		s = res / 10;
		i = res % 10;
		
		System.out.println("입력받은 숫자 ==> " + num);
		System.out.println("오천원 지폐 : " + oc + "장");
		System.out.println("천원 지폐 : " + c + "장");
		System.out.println("오백원 동전 : " + ob + "개");
		System.out.println("백원 동전 : " + b + "개");
		System.out.println("오십원 동전 : " + os + "개");
		System.out.println("십원 동전 : " + s + "개");
		System.out.println("일원 동전 : " + i + "개");

	}

}