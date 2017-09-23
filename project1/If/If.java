import java.util.Scanner;
import java.util.InputMismatchException;

public class If{
	public static final int V = 10;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter time");
		try {
			int t = sc.nextInt();
			System.out.println("Ответ = " + V * t);
		}catch(InputMismatchException e){
			System.out.println("incorrect format ");
		}


	}
}