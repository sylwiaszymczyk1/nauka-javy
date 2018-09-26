import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie8choinkaOdbicie {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int liczbaPoziomow = 3;

		System.out.println("Podaj liczbe gwiazdek");
		liczbaPoziomow = Integer.parseInt(bufferedReader.readLine());

		for (int i = 1; i <= liczbaPoziomow; i++) {

			
			for(int k=0; k< liczbaPoziomow - i; k++) {
				System.out.print(" ");
			}
				
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
