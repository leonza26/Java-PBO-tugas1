import java.util.Scanner;

public class BebekUntukTeman{
	public static void main(String[] args){
		int a, b, hasilpembagianbebek, sisabebek;

		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();

		 hasilpembagianbebek = a/b;
		 sisabebek = a%b;

		 System.out.println("masing-masing " +hasilpembagianbebek);
		  System.out.println("bersisa " +sisabebek);

	}
}