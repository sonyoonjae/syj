package javastudy;

public class CConverterApp {

	public static void main(String[] args) {

		double dollar;
		double won;

		CConverter.setRate(1099);
		System.out.println("�鸸���� " + CConverter.toDollar(1000000) + "�Դϴ�.");

		System.out.println("��޷��� " + CConverter.toKRW(100) + "�Դϴ�.");

	}

}
