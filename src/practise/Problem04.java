package practise;

public class Problem04 {

	public static void main(String[] args) {
		
//		// (문제3) 키보드로 임의의 숫자 4자리를 입력을 받는다.
//		오천원짜리 몇장, 천원짜리 몇장, 오백원짜리 몇개,백원짜리 몇개,
//		오십원짜리 몇개, 십원짜리 몇개, 일원짜리가 몇개로 구성되어
//		있는지 화면에 출력해 보세요.
//		예) 3781 = 천원짜리 3장, 오백원짜리 1개, 백원짜리 2개,
//		오십원짜리 1개, 십원짜리 3개, 일원짜리 1개
		
		int num = Integer.parseInt(args[0]);
		
		int fs = num / 5000;
		int fs2 = num % 5000;
		int os = fs2 / 1000;
		int os2 = fs2 % 1000;
		int fh = os2 / 500;
		int fh2 = os2 % 500;
		int oh = fh2 / 100;
		int oh2 = fh2 % 100;
		int ft = oh2 / 50;
		int ft2 = oh2 % 50;
		int ot = ft2 / 10;
		int ot2 = ft2 % 10;
		
		
		System.out.println("입력받은 숫자 ==> " + num);
		System.out.println("오천원 지폐 : " + fs + "장");
		System.out.println("천원 지폐 : " + os + "장");
		System.out.println("오백원 동전 : " + fh + "개");
		System.out.println("백원 동전 : " + oh + "개");
		System.out.println("오십원 동전 : " + ft + "개");
		System.out.println("십원 동전 : " + ot + "개");
		System.out.println("일원 동전 : " + ot2 + "개");
	}

}
