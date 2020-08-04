import java.util.Scanner;
public class Bai09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mời nhập số tự nhiên n:   ");
		int n = sc.nextInt();
		int sum=0;
		
		for (int i=0; sum <= n; i++) {
			sum += Math.pow(2,i);
			if (sum <= n) {
				if ( i%2 != 0) {
					System.out.println( sum* (-1) );
				} else {
					System.out.println(sum );
				}
			}
		}
	}
}
