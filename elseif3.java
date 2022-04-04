// car racing speed warning show
import java.util.*;
public class Spd{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A SPEED: ");
		int spd = sc.nextInt();
		if (spd>=0 && spd<=50) {
			System.out.println("YOU ARE DRIVE NORMAL");
		}
		else if (spd>=61 && spd<=80) {
			System.out.println("YOU ARE DRIVE FAST");
		}
		else if(spd>=81 && spd<=100){
			System.out.println("YOU ARE DRIVE DANGERIOUE");
		}
		else if(spd>=101 && spd<=140){
			System.out.println("YOU ARE DRIVE MORE DANGERIOUS");
		}
		else{
			System.out.println("YOU ARE NOT DRIVE");
		}
	}
}