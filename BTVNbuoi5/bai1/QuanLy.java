import java.util.Scanner;

public class QuanLy {
    private String maQL, hoTen;

    public void INPUT() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã quản lý: ");
        maQL = scanner.nextLine();
        System.out.println("Nhập họ tên: ");
        hoTen = scanner.nextLine();
    }

    public void OUTPUT() {
        System.out.println("Mã quản lý: " + maQL);
        System.out.println("Họ tên: " + hoTen);
    }
}
