import java.util.Random;
import java.util.Scanner;

public class Zadanie11 {

	static int a = 0;
	static int b = 0;
	static int option = -1;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (option != 0) {
			printVariables();
			printOptions();
			readOption(scanner);

			switch (option) {
			case 1:
				assignA(scanner);
				break;
			case 2:
				assignB(scanner);
				break;
			case 0:
				break;
			case 3:
				computeAplusB();
				break;
			default:
				option = -1;
				break;
			}
		}

		System.out.println("Wyszedles z programu");
	}

	private static void readOption(Scanner scanner) {
		System.out.print("Podaj opcje: ");
		option = Integer.parseInt(scanner.nextLine());
	}

	private static void computeAplusB() {
		a = a + b;
		System.out.println("A + B = " + a);
	}

	private static void assignB(Scanner scanner) {
		System.out.println("Podaj jakie ma byæ B:");
		b = Integer.parseInt(scanner.nextLine());
	}

	private static void assignA(Scanner scanner) {
		System.out.println("Podaj jakie ma byæ A:");
		a = Integer.parseInt(scanner.nextLine());
	}

	public static void printOptions() {
		System.out.println("Program KALKULATOR");
		System.out.println("Podaj opcje:");
		System.out.println("1. Przypisz do A");
		System.out.println("2. Przypisz do B");
		System.out.println("3. A + B -> A");
	}

	public static void printVariables() {
		System.out.println("A = " + a + ", B = " + b);
	}

}
