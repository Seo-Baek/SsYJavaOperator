package practise;

public class Problem02 {

	public static void main(String[] args) {
		// (문제2) 임의의 정수 하나를 입력 받아서 그 수의
//		제곱근, 세제곱근을 구하여 화면에 출력해 보세요.
		
		int num = Integer.parseInt(args[0]);
		int result = num*num;
		
		System.out.printf("입력받은 정수 ==> %d\n", num);
		System.out.printf("%d의 제곱근 ==> %d\n", num, result);
		System.out.printf("%d의 세제곱근 ==> %d", num, (result * num));
	}

}
