import com.google.common.annotations.VisibleForTesting;

import java.util.Random;

public class TestDemo {

	public int randomNumberSquared() {
		int result = getRandomInt();
		return result * result;
	}
	
	
	
	
	
	
	@VisibleForTesting
	int getRandomInt() {
		Random random = new Random();
		
		return random.nextInt(10) + 1;
	}







	public int addPositive(int a, int b) {
		if (a > 0 || b > 0) {
			return a + b;
		}
		throw new IllegalArgumentException("Both parameters must be positive!");
	}
	
}
