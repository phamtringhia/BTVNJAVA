import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int tong = 0;
        System.out.println("Nhap n: ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                tong = tong + i;
            }
        }
        System.out.println("Tong cac uoc cua n la: " + tong);
    }
}
