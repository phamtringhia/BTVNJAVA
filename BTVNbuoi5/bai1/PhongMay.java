import java.util.Scanner;

public class PhongMay {
    private String maPhong, tenPhong;
    private Integer dienTich;
    QuanLy x;
    May y;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã phòng: ");
        maPhong = scanner.nextLine();
        System.out.println("Nhập tên phòng: ");
        tenPhong = scanner.nextLine();
        System.out.println("Nhập diện tích: ");
        dienTich = scanner.nextInt();
        scanner.nextLine();
        x = new QuanLy();
        x.INPUT();
        y = new May();
        y.input();
    }

    public void output() {
        System.out.println("Mã phòng: " + maPhong);
        System.out.println("Tên phòng: " + tenPhong);
        System.out.println("Diện tích: " + dienTich);
        System.out.println("Quản lý: ");
        x.OUTPUT();
        System.out.println("Máy: ");
        y.output();
    }
}
