import java.util.Scanner;
class Hi{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number");
		int a = sc.nextInt();
		System.out.println("Enter a second number");
		int b = sc.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
}