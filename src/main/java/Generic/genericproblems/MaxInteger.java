
package Generic.genericproblems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MaxInteger {
	private static final Logger logger = LogManager.getLogger(App.class);

	int calculateMaximum(int[] ArrayOfInputs) {
		int max = ArrayOfInputs[0];
		if (ArrayOfInputs[1] > max) {
			max = ArrayOfInputs[1];
		}
		if (ArrayOfInputs[2] > max) {
			max = ArrayOfInputs[2];
		}
		return max;
	}

	<T> void checkMaxAt2ndPos(T val, T max) {
		if (val == max) {
			logger.info("Max Number is at Position 2! " + max);
		} else {
			logger.info("Max Number is not present at Position 2! " + max);
		}
	}
}