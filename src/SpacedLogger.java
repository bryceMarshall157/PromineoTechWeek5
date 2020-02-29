import java.util.Date;

public class SpacedLogger implements Logger {

	private static StringBuilder spacedString(String original) {

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < original.length(); i++) {
			result.append(original.charAt(i));
			result.append(" ");
		}

		return result;
	}

	@Override
	public void log(String info) {

		Date date = new Date();

		System.out.println("\n" + date.toString() + ": " + spacedString(info));

	}

	@Override
	public void error(String error) {

		Date date = new Date();

		System.out.println(date.toString() + ": ERROR: " + spacedString(error));

	}

}
