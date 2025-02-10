
public class Factorial {

	private int number;

	public Factorial(int number) {
		this.number = number;
	}

	public long calcFactorial() {
		long result = 1; // 0! = 1

		if (number >= 0) { //falls sichergestellt werden soll, dass nur positive Zahlen erlaubt sind
			for (int i = 1; i <= this.number; i++) {
				result = result * i;
			}
		} else {
			result = 0;
		}

		return result;
	}
}
