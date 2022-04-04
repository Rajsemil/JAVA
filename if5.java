// find greater than number
import java.util.*;
public class Greater{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a first number");
		int a = sc.nextInt();
		if (a>=0) {
			System.out.println("Positive number");
		} else{
			System.out.println("Negative number");
		}
	}
}