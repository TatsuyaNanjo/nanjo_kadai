package kadai_1;

public class Tax {
	static final double TAX_RATE = 0.1;

	public static void main(String[] args) {


		int price = 1000;
		int tax = calcTax(price);

		System.out.println(price + "円の商品の税込み価格は" + (price + tax) + "円（消費税は" + tax + "円）です" );
	}

	static int calcTax(int pr) {
		return(int)(pr * TAX_RATE);
	}

}
