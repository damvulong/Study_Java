import java.util.Scanner;
public class Bai08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mời nhập số tự nhiên n:   ");
		int n = sc.nextInt();
		int sum=0;
		
		for (int i=0; sum <= n; i++) {
			sum += Math.pow(2,i);
			if (sum <= n) {
			System.out.println(sum);
			}
		}
	}
}
