package practise;

public class Problem03 {

	public static void main(String[] args) {
//		// (문제3) 키보드로 금액과 상품단가, 수량을 입력하면 부가세, 상품총액,
//		거스름돈을 화면에 보여주는 프로그램을 완성해 보세요.
//		※ 부가세 : (상품단가 * 수량) 의 10%
//		※상품총액 : (상품단가 * 수량) + 부가세
		
		int myMoney = Integer.parseInt(args[0]);
		int price = Integer.parseInt(args[1]);
		int goodsNum = Integer.parseInt(args[2]);
		
		int surtax = (int)((price * goodsNum) * 0.1);
		int allP = (price * goodsNum) + surtax;
		int charge = myMoney - allP;
		
		System.out.printf("지불한 금액 : %d원\n", myMoney);
		System.out.println("제품단가 : " + price + "원");
		System.out.println("수량 : " + goodsNum + "개");
		System.out.println("공급가 : " + (price * goodsNum) + "원");
		System.out.printf("부가세 : %d원\n", surtax);
		System.out.printf("상품총액 : %d원\n", allP);
		System.out.printf("거스름 돈 : %d원\n", charge);

	}

}
