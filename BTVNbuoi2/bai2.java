import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Nhap canh thu nhat: ");
        a = scanner.nextInt();
        System.out.println("Nhap canh thu hai: ");
        b = scanner.nextInt();
        System.out.println("Nhap canh thu ba: ");
        c = scanner.nextInt();
        if ((a >= b + c) || (b >= a + c) || (c >= a + b))
            System.out.println("Ba canh tren khong phai cua mot tam giac!");
        else {
            if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
                System.out.println("Tam giac do la tam giac vuong");
                if (a == b || a == c || b == c)
                    System.out.println("Tam giac do la tam giac vuong can");
            }
            else if (a == b && b == c)
                System.out.println("Tam giac do la tam giac deu");
            else if (a == b || a == c || b == c)
                System.out.println("Tam giac do la tam giac can");
            else
                System.out.println("Tam giac do la tam giac thuong");
        }
    }
}
