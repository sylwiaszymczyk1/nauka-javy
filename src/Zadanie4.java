import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Podaj pierwsza liczbe");
		int liczba1 = 125;
		liczba1 = Integer.parseInt(bufferedReader.readLine());

		System.out.println("Podaj druga liczbe");
		int liczba2 = 24;
		liczba2 = Integer.parseInt(bufferedReader.readLine());

		int suma = liczba1 + liczba2;
		int roznica = liczba1 - liczba2;
		int iloraz = liczba1 / liczba2;
		int iloczyn = liczba1 * liczba2;
		int modulo = liczba1 % liczba2;

		String liczbyWNawiasie = "(" + liczba1 + " i " + liczba2 + ")";
		System.out.println("Suma liczb" + liczbyWNawiasie + " wynosi " + suma);
		System.out.println("Roznica liczb" + liczbyWNawiasie + " wynosi " + roznica);;
		System.out.println("Iloraz liczb" + liczbyWNawiasie + " wynosi " + iloraz);
		System.out.println("Iloczyn liczb" + liczbyWNawiasie + " wynosi " + iloczyn);
		System.out.println("Modulo liczb" + liczbyWNawiasie + " wynosi " + modulo);

	}

}
