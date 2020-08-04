import java.util.Scanner;
public class Bai02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mời nhập số tự nhiên n:   ");
		int n = sc.nextInt();
		for ( int i=1; i <= n; i++) {
			if ( i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
