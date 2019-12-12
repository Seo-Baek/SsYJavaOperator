package practise;

public class Etc01 {

	public static void main(String[] args) {
		
		//응시하지 않은 과목의 점수는 0으로 처리해주세요!
		int kor = Integer.parseInt(args[0]);
		int eng = Integer.parseInt(args[1]);
		int sci = Integer.parseInt(args[2]);
		int mat = Integer.parseInt(args[3]);
		
	
		
		int i = 0;
		if(kor >= 1) {
			++i;
			if(eng >= 1) {
				++i;
				if(sci >=1) {
					++i;
					if(mat >= 1) {
						++i;
					}
				}
			}
		
	} //if end
	float result = (float)(kor + eng + sci + mat) /i;
	
		System.out.printf("응시한 과목 수 : %d\n", i);
		System.out.printf("평균 점수 : %.2f", result);
		
	} //main end

} // class end
