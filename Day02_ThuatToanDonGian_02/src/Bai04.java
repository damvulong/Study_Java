import java.util.Scanner;
public class Bai04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mời nhập số tự nhiên n:   ");
		int n = sc.nextInt();
		for ( int i=2; i <= n; i+=2) {
			int j = i/2;
			if ( j % 3 != 0) {
				System.out.println(i);
			} else {
				System.out.println(i * (-1));
			}
		}
	}
}
