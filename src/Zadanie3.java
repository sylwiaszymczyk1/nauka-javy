import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Podaj pierwsza liczbe");
		int liczba1;
		liczba1 = Integer.parseInt(bufferedReader.readLine());
		System.out.println("Podaj druga liczbe");
		int liczba2;
		liczba2 = Integer.parseInt(bufferedReader.readLine());
		if (liczba2==0) {
			System.out.println("Nie dzieli siê przez 0");
			return;
		}
		float wynikdzielenia = (float)liczba1/liczba2;
		System.out.println(wynikdzielenia);
	
	}
}