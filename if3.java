// pass and fail find
import java.util.*;
public class School{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks =sc.nextInt();
		if (marks>=33) {
			System.out.println("You are passed");
		} else{
			System.out.println("You are failed");
		}
	}
}