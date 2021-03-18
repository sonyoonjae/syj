package javastudy;

public class CConverterApp {

	public static void main(String[] args) {

		double dollar;
		double won;

		CConverter.setRate(1099);
		System.out.println("백만원은 " + CConverter.toDollar(1000000) + "입니다.");

		System.out.println("백달러는 " + CConverter.toKRW(100) + "입니다.");

	}

}
