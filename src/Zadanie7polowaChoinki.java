import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie7polowaChoinki {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int poziomyChoinki = 4;

		System.out.println("Podaj liczbe gwiazdek");
		poziomyChoinki = Integer.parseInt(bufferedReader.readLine());

		for (int i = 0; i < poziomyChoinki; i++) {

			for (int j = 0; j <= i; j++) {
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
