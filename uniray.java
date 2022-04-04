import java.util.Scanner;
class Hi{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number");
		int a = sc.nextInt();
		System.out.println("Enter a second");
		int b = sc.nextInt();
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(b--);
		System.out.println(--b);
	}
}