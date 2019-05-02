package otherLabs;
	
import java.util.Scanner;

public class Test {

private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);	
		System.out.println("#8 is");
		long max = 0;
		long min = 0;
		long hold = 0;
		long[] arr = {942381765, 627450398, 954173620, 583762094, 236817490};
		for (int i = 0;i<=4;i++) {
			hold = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
			hold = hold - arr[i];
			if (i == 1) {
				min=hold;
			}
			if (hold > max) {
				max = hold;
			}
			if (hold < min) {
				min = hold;
			}
		}
		System.out.println(min+" "+max);

	System.out.println();	
	}
}
