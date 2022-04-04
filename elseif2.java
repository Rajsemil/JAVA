// Find the 10th class marks percentage
import java.util.*;
public class Per{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER HINDI MARKS: ");
		int h = sc.nextInt();
		System.out.print("ENTER ENGLISH MARKS: ");
		int e = sc.nextInt();
		System.out.print("ENTER SANSKRIT MARKS: ");
		int s = sc.nextInt();
		System.out.print("ENTER MATHMATISC MARKS: ");
		int m = sc.nextInt();
		System.out.print("ENTER SCIENCE MARKS: ");
		int sci = sc.nextInt();
		System.out.print("ENTER SOCIEL SCIENCE MARKS: ");
		int ss = sc.nextInt();
		int sum = m+ss+sci+s+s+e+h;
		System.out.print("SUM: ");
		System.out.println(sum);
		System.out.print("PERCENTAGE: ");
		System.out.println(sum/6);
		if (h==1 && h>=100) {
			System.out.println(h);
		}
	}
}