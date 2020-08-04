import java.util.Scanner;
public class Bai05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mời nhập số tự nhiên n:   ");
		int n = sc.nextInt();
		for ( int i=2; i <= 2*n; i+=2) {
			System.out.println( i );
		}
	}
}
