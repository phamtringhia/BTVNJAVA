import java.util.Scanner;

public class bai3 {
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static boolean isPrime(long n) {
        if (n < 2)
            return false;
        else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static boolean isPrime(float n) {
        return false;
    }

    public static boolean isPrime(double n) {
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n1 = scanner.nextInt();
        if (isPrime(n1))
            System.out.println(n1 + " là số nguyên tố");
        else
            System.out.println(n1+ " không là số nguyên tố");
//        ------------------------------------------------------------------------------------------
        System.out.println("Nhập n: ");
        long n2 = scanner.nextLong();
        if (isPrime(n2))
            System.out.println(n2 + " là số nguyên tố");
        else
            System.out.println(n2 + " không là số nguyên tố");
//        ------------------------------------------------------------------------------------------
        System.out.println("Nhập n: ");
        float n3 = scanner.nextFloat();
        if (isPrime(n3))
            System.out.println(n3 + " là số nguyên tố");
        else
            System.out.println(n3 + " không là số nguyên tố");
//        -------------------------------------------------------------------------------------------
        System.out.println("Nhập n: ");
        double n4 = scanner.nextDouble();
        if (isPrime(n4))
            System.out.println(n4 + " là số nguyên tố");
        else
            System.out.println(n4 + " không là số nguyên tố");
    }
}
