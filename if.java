import java.util.Scanner; 
public class Example{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if (a%2==0) {
			System.out.println("THIS IS EVEN NUMBER");
		} else{
			System.out.println("THIS IS ODD NUMBER");
		}
	}
}