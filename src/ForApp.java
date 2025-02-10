import java.util.Scanner;

public class ForApp {

	public static void main(String[] args) {
		
		//Auftrag 1
		for(int i = 42; i <= 53; i++) {
			System.out.println(i);
		}
		
		//Auftrag 2
		for(int i = 3; i >= 0; i--) {
			if(i != 0) {
				System.out.println(i);
			} else {
				System.out.println("Los");
			}
		}
		
		//Auftrag 3
		Scanner sc = new Scanner(System.in);
		System.out.println("Zahl eingeben: ");
		int number = sc.nextInt();
		
		Factorial fac = new Factorial(number);
		long result = fac.calcFactorial();
		System.out.println("Resultat: " + result);
	}
}
