import java.util.Scanner;

public class NhanVien extends CanBo {
    protected String Job;

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public void inputNhanVien() {
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
        System.out.println("Nhập công việc: ");
        Job = scanner.nextLine();
    }
    public void ShowNhanVien() {
            System.out.println(id + " " + Fullname + " " + NamSinh + " " + Gender + " " + Address + " " + Job);
        }
    }




