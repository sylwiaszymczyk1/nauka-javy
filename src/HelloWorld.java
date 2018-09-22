import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {

	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Witaj");
		String imie = "";
		System.out.println("Podaj imie");
		imie = bufferedReader.readLine();
		System.out.println("Witaj " + imie);
		

	}
	
}
