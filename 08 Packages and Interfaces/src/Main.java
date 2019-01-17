import com.daugherty.gadgets.CalculatorWatch;
import com.daugherty.math.ICalculator;
import com.daugherty.time.IWatch;

public class Main {

	public static void main(String[] args) {
		CalculatorWatch calculatorWatch = new CalculatorWatch();

		int addedNumbers = ICalculator.calculateAdd(2, 2);
		long currentUNIXTime = IWatch.getUNIXEpochTime();

		System.out.println("The result of the addition is " + addedNumbers + " and the current UNIX time is " + currentUNIXTime);
		// Prints: ‘The result of the addition is 4 and the current UNIX time is 1467411884801’

	}

}
