import java.util.Scanner;
public class Bai12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mời nhập số m:   ");
		int m = sc.nextInt();
		int S=0;
		int P=1;
		while ( m > 0) {
			int balance = m % 10;
			S += balance;
			P *= balance;
			m /= 10;
		}
		System.out.println("Tổng chữ số của số m là:   " + S);
		System.out.println("Tích chữ số của số m là:   " + P);
		
	}
}
