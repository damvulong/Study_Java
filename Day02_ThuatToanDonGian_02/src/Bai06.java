import java.util.Scanner;
public class Bai06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mời nhập số tự nhiên n:   ");
		int n = sc.nextInt();
		int m = 0;
		
		for ( int i=1; m <= n-2; i++) {
			for ( int j=1; j <= i; j++) {
				if (m <= n-2) {
					m += 2;
					System.out.println( m );
				}
			}
			if (m <= n-2) {
				m += 2;
				System.out.println( m * (-1));
			}
		}
	}
}
