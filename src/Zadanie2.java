import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Podaj pierwsza liczbe");
		int liczba1;
		liczba1 = Integer.parseInt(bufferedReader.readLine());
		System.out.println("Podaj druga liczbe");
		int liczba2;
		liczba2 = Integer.parseInt(bufferedReader.readLine());
		int suma = liczba1 + liczba2;
		System.out.println(suma);

	}

}
