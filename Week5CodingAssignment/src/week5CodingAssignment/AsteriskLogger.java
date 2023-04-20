package week5CodingAssignment;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String string) {
		System.out.println("***" + string + "***");
		
	}

	@Override
	public void Error(String string2) {
		int boxedAsterisk = string2.length() + 13;
		System.out.println("*".repeat(boxedAsterisk));
		System.out.println("***ERROR: " + string2 + "***");
		System.out.println("*".repeat(boxedAsterisk));
	}

}
