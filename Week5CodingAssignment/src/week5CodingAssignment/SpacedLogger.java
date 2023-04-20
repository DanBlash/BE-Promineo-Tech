package week5CodingAssignment;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String string) {
		System.out.println(string.replace("", " ").trim());
	}

	@Override
	public void Error(String string2) {
		System.out.println("ERROR:" + string2.replace("", " ").trim());
		
	}

}
