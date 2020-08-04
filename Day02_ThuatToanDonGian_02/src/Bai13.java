import java.util.Scanner;
public class Bai13 {
	public static long UCLN(int a, int b) {
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}
	public static long BCNN(int a, int b) {
		long bcnn = a * b / Bai13.UCLN(a, b);
		return bcnn;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời nhập số a:   ");
		int a = sc.nextInt();
		System.out.println("Mời nhập số b:   ");
		int b = sc.nextInt();
		System.out.println("Ước chung lớn nhất của 2 số a và b là:   " + Bai13.UCLN(a, b));
		System.out.println("Bội chung nhỏ nhất của 2 số a và b là:   " + Bai13.BCNN(a, b));
	}
}
