import java.util.Scanner;
public class Bai11 {
	public static long tinhgiaithua(int n) {
		int giaithua = 1;
		for (int i=1; i <= n; i++) {
			giaithua *= i;
		}
		return giaithua;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mời nhập số n:   ");
		int n = sc.nextInt();
		float sum = 0;
		while ( n <= 0 & n == 0 ) {
			System.out.print("Mời nhập lại số n:   ");
			n = sc.nextInt();
		}
		for (int i=1; i <= 2*n-1; i+=2) {
			sum += (float) 1/ Bai11.tinhgiaithua(i);
		}
		System.out.println("Tổng bằng:   " + sum);
	}
}
