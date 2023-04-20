package week5CodingAssignment;

public class App {

	public static void main(String[] args) {

		AsteriskLogger asteriskLogger = new AsteriskLogger();
		SpacedLogger spacedLogger = new SpacedLogger();
		
		spacedLogger.Log("Hello");
		spacedLogger.Error("Hello");
		asteriskLogger.Log("Hello");
		asteriskLogger.Error("Hello");
	}

}
