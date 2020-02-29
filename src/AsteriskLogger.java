import java.util.Date;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String info) {

		Date date = new Date();

		System.out.println(date.toString() + ": ***" + info.toString() + "***");

	}

	@Override
	public void error(String error) {

		Date date = new Date();

		System.out.println(date.toString() + ": ");

		for (int i = 0; i < error.length() + 13; i++) {
			System.out.print("*");
		}

		System.out.println("\n***Error: " + error.toString() + "***");

		for (int i = 0; i < error.length() + 13; i++) {
			System.out.print("*");
		}

	}

}
