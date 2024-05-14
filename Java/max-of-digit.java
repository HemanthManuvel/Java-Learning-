
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int max = 0, re = 0, r;
		while (n != 0) {
			r = n % 10;
			if (r > re && r > max) {
				max = r;
			}
			re = r;
			n = n / 10;
		}
		System.out.print(max);
	}
}
