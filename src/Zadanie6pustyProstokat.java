import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie6pustyProstokat {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int liczbaGwiazdek = 4;

		System.out.println("Podaj liczbe gwiazdek");
		liczbaGwiazdek = Integer.parseInt(bufferedReader.readLine());

		for (int i = 0; i < liczbaGwiazdek; i++) {

			for (int j = 0; j < liczbaGwiazdek; j++) {
				if (i == 0 || j == 0 || i == liczbaGwiazdek - 1 || j == liczbaGwiazdek - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
