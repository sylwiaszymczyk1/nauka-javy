import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie5petlafor {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int liczbaPotegowana;
		int liczbaDoPotegi;

		System.out.println("Podaj liczbe");
		liczbaPotegowana = Integer.parseInt(bufferedReader.readLine());
		System.out.println("Podaj potege");
		liczbaDoPotegi = Integer.parseInt(bufferedReader.readLine());

		for (int i = 1; i <= liczbaDoPotegi; i++) {
			int wynik = 1;
			for (int j = 1; j <= i; j++) {
				wynik = wynik * liczbaPotegowana;
			}
			System.out.println(liczbaPotegowana + " do potegi " + i + " wynosi " + wynik );
			
		}

		

	}

}
