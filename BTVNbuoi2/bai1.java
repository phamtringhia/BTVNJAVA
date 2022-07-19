import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d, m;
        System.out.println("Nhap ngay: ");
        d = scanner.nextInt();
        System.out.println("Nhap thang: ");
        m = scanner.nextInt();
        if (d < 1 || d > 31 || m < 1 || m > 12)
            System.out.println("Khong co ngay thang do!");
        else {
            System.out.println("Ngay " + d + " Thang " + m);
            if ((d >= 20 && m == 1) || (d <= 18 && m == 2))
                System.out.println("Thuoc cung Bao Binh(20/1 - 18/2)");
            else if ((d >= 19 && m == 2) || (d <= 20 && m == 3))
                System.out.println("Thuoc cung Song Ngu(19/2 - 20/3)");
            else if ((d >= 21 && m == 3) || (d <= 20 && m == 4))
                System.out.println("Thuoc cung Bach Duong(21/3 - 20/4)");
            else if ((d >= 21 && m == 4) || (d <= 20 && m == 5))
                System.out.println("Thuoc cung Kim Nguu(21/4 - 20/5)");
            else if ((d >= 21 && m == 5) || (d <= 21 && m == 6))
                System.out.println("Thuoc cung Song Tu(21/5 - 21/6)");
            else if ((d >= 22 && m == 6) || (d <= 22 && m == 7))
                System.out.println("Thuoc cung Cu Giai(22/6 - 22/7)");
            else if ((d >= 23 && m == 7) || (d <= 22 && m == 8))
                System.out.println("Thuoc cung Su Tu(23/7 - 22/8)");
            else if ((d >= 23 && m == 8) || (d <= 22 && m == 9))
                System.out.println("Thuoc cung Xu Nu(23/8 - 22/9)");
            else if ((d >= 23 && m == 9) || (d <= 23 && m == 10))
                System.out.println("Thuoc cung Thien Binh(23/9 - 23/10)");
            else if ((d >= 24 && m == 10) || (d <= 22 && m == 11))
                System.out.println("Thuoc cung Bo Cap(24/10 - 22/11)");
            else if ((d >= 23 && m == 11) || (d <= 21 && m == 12))
                System.out.println("Thuoc cung Nhan Ma(23/11 - 21/12)");
            else
                System.out.println("Thuoc cung Ma Ket(22/12 - 19/1)");
        }
    }
}
