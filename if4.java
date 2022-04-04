// find greater than number
import java.util.*;
public class Greater{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a first number");
		int a = sc.nextInt();
		System.out.println("Enter a second number");
		int b = sc.nextInt();
		if (a<b) {
			System.out.println("Greater number");
		} else{
			System.out.println("Lower number");
		}
	}
}