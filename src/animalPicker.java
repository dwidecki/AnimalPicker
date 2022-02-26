import java.util.Scanner;

public class animalPicker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to see: a dog or a cat?");
		String userInput = scanner.next();

		if (userInput.equalsIgnoreCase("dog")) {
			System.out.println("DOG ASCII ART HERE");
		}

		else if (userInput.equalsIgnoreCase("cat")) {
			System.out.println("CAT ASCII ART HERE");
		}
		
	}

}
