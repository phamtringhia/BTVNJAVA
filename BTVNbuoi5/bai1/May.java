import java.util.Scanner;

public class May {
    private String maMay, kieuMay, tinhTrang;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã máy: ");
        maMay = scanner.nextLine();
        System.out.println("Nhập kiểu máy: ");
        kieuMay = scanner.nextLine();
        System.out.println("Nhập tình trạng: ");
        tinhTrang = scanner.nextLine();
    }

    public void output() {
        System.out.println("Mã máy: " + maMay);
        System.out.println("Kiểu máy: " + kieuMay);
        System.out.println("Tình trạng: " + tinhTrang);
    }
}
