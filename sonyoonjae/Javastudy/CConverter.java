package javastudy;

public class CConverter {

	public static double rate;

	public static double toDollar(double won) {
		return won / rate;

	}

	public static double toKWR(double dollar) {
		return dollar * rate;
	}

	public static void setRate(double r) {
		rate = r;
	}

}
