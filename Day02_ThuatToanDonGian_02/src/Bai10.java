import java.util.Scanner;
public class Bai10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mời nhập số n:   ");
		int n = sc.nextInt();
		float sum = 0;
		while ( n <= 0 & n == 0 ) {
			System.out.print("Mời nhập lại số n:   ");
			n = sc.nextInt();
		}
		for (int i=1; i <= n; i++) {
			sum += (float) 1/i;
		}
		System.out.println("Tổng bằng:   " + sum);
	}
}
