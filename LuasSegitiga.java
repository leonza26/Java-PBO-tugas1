import java.util.Scanner;

public class LuasSegitiga{
	public static void main(String[] args){
		float alas, tinggi, luassegitiga;

		Scanner input = new Scanner(System.in);
		alas = input.nextInt();
		tinggi = input.nextInt();

		luassegitiga = alas*tinggi/2;
		 

		 System.out.printf("%.2f\n", luassegitiga);
		
	}
}