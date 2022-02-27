import java.util.Scanner;

public class animalPicker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean valid = false;
		while (!valid) {
		System.out.println("Would you like to see: a dog or a cat?");
		String userInput = scanner.next();

		if (userInput.equalsIgnoreCase("dog")) {
			valid = true;
			System.out.println("  __      _\no\'\')}____//\n `_/      )\n (_(_/-(_/");
		}

		else if (userInput.equalsIgnoreCase("cat")) {
			valid = true;
			System.out.println("  |\\---/|\n   | ,_, |\n    \\_`_/-..----.\n ___/ `   \' ,\"\"+ \\  sk\n(__...\'   __\\    |`.___.\';\n  (_,...\'(_,.`__)/\'.....+");
		}
		
		else if (userInput.equalsIgnoreCase("fish")) {
			valid = true;
			System.out.println("    /`·.¸\n     /¸...¸`:·\n ¸.·´  ¸   `·.¸.·´)\n: © ):´;      ¸  {\n `·.¸ `·  ¸.·´\\`·¸)\n     `\\\\´´\\¸.·´");
		}
		else {
			System.out.println("ERROR: Invalid Input!");
		}
		}
	}

}
