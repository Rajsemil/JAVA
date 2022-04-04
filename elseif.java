import java.util.*;
public class Mrks{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		int mrks = sc.nextInt();
		if (mrks>=33 && mrks<=49) {
			System.out.println("Your grade is C");
		}
		else if(mrks>=50 && mrks<=70){
			System.out.println("Your grade is B");
		}
		else if(mrks>=71 && mrks<=90){
			System.out.println("Your grade is A");
		}
		else if(mrks>=91 && mrks<=100){
			System.out.println("Your grade is A++");
		}
		else{
			System.out.println("You are failed");
		}
	}
}