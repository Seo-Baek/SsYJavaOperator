package practise;

public class Problem01 {

	public static void main(String[] args) {
		//(문제1) 국어, 영어, 수학, 자바 변수를 만들고 해당 변수에
//		점수를 입력 후 총점과 평균을 구하여 화면에 출력해
//		보세요.
//		조건1) 평균은 소숫점 이하 2자리까지만 출력할 것.
		
		int kor = 80, eng = 85, mat = 90, java = 70;
		
		int tot = kor + eng + mat + java; 
		System.out.printf("국어점수 : %d점\n", kor);
		System.out.printf("영어점수 : %d점\n", eng);
		System.out.printf("수학점수 : %d점\n", mat);
		System.out.printf("자바점수 : %d점\n", java);
		System.out.printf("총  점 : %d점\n", tot);
		System.out.printf("평  균 : %.2f점", (tot / 4.0f));
		
		
	}

}
