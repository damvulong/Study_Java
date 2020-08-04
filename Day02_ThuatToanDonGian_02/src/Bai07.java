import java.util.Scanner;
public class Bai07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mời nhập số tự nhiên n:   ");
		int n = sc.nextInt();
		int a1=0;
		int a2=1;
		int sum=0;
		for (int i=1; sum <= n; i++) {
			sum = a1 + a2;
			a1 = a2;
			a2 = sum;
			if (sum <= n) {
				System.out.println(sum);
			}
		}
	}
}
