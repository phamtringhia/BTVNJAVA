import java.util.Scanner;

public class CongNhan extends CanBo {
    protected String Rank;

    public String getRank() {
        return Rank;
    }

    public void setRank(String rank) {
        Rank = rank;
    }

    public void inputCongNhan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập họ tên: ");
        Fullname = scanner.nextLine();
        System.out.println("Nhập năm sinh: ");
        NamSinh = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        Gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        Address = scanner.nextLine();
        System.out.println("Nhập bậc: ");
        this.Rank = scanner.nextLine();
    }

    public void ShowCongNhan() {
        System.out.println(id + " " + Fullname + " " + NamSinh + " " + Gender + " " + Address + " " + Rank);
    }
}
