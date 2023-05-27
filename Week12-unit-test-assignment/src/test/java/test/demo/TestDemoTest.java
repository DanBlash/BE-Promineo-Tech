package test.demo;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestDemoTest {

	private TestDemo testDemo;
	
	
	
	
	@BeforeEach
	void setUp() {
		 
	testDemo = new TestDemo();	
	}
	
	/**
	 * <pre>
	 * 1. If two numbers are positive (>0)
	 * 2. If one or both are not positive, throw Illegal Argument Exception.
	 * </pre>
	 */
	
	
	
	
	@Test
	void assertThatNumberSquaredIsCorrect() {
		TestDemo mockDemo = spy(testDemo);
		
		doReturn(5).when(mockDemo).getRandomInt();
		
		int fiveSquared = mockDemo.randomNumberSquared();
		
		
		assertThat (fiveSquared).isEqualTo(25);
	}
	
	

	@ParameterizedTest
	@MethodSource("test.demo.TestDemoTest#argumentsForAddPositive")
	void assertThatTwoPositiveNUmbersAreAddedCorrectly(int a, int b, int expected, Boolean expectException) {
		if(!expectException) {
			assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
		} else {
			assertThatThrownBy(() -> testDemo.addPositive(a, b)).isInstanceOf(IllegalArgumentException.class);
		}	
	}

	static Stream<Arguments> argumentsForAddPositive() {
		//formatter:off
		return Stream.of(
				arguments(2, 4, 6, false),
				arguments(3, 6, 9, false),
				arguments(5, 2, 7, false),
				arguments(-1, 5, 4, true),
				arguments(5, -3, 2, true),
				arguments(0, 2, 2, true), 
				arguments(8, 0, 8, true));
	}
		
	
}
