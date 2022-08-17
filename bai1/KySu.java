import java.util.Scanner;

public class KySu extends CanBo {
    protected String NganhDaoTao;

    public String getNganhDaoTao() {
        return NganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        NganhDaoTao = nganhDaoTao;
    }

    public void inputKySu() {
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
        System.out.println("Nhập ngành đào tạo: ");
        this.NganhDaoTao = scanner.nextLine();
    }

    public void ShowKySu() {
        System.out.println(id + " " + Fullname + " " + NamSinh + " " + Gender + " " + Address + " " + NganhDaoTao);
    }
}
