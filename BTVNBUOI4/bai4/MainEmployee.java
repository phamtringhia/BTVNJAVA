import java.util.Scanner;

public class MainEmployee {
    public static void main(String[] args) {
        Employee[] a = new Employee[3];
        for (int i = 0; i < 3; i++) {
            a[i] = nhap(a[i]);
        }
        System.out.printf("%35s%n", "THONG TIN CAC NHAN VIEN");
        System.out.printf("%10s%10s%10s%10s%10s\n", "Manv", "Tennv", "Tuoi", "SoNC", "Salary");
        for (int i = 0; i < 3; i++) {
            xuat(a[i]);
        }
    }
    private static Employee nhap(Employee x) {
        Scanner read = new Scanner(System.in);
        x = new Employee();
        System.out.print("Nhập tên nhân viên: ");
        x.setTenNv(read.next());
        System.out.print("Nhập tuổi: ");
        x.setTuoi(read.nextInt());
        System.out.print("Nhập số ngày công: ");
        x.setSoNgaycong(read.nextInt());
        return x;
    }

    private static void xuat(Employee x) {
        Employee.id();
        System.out.printf("%10d%10s%10d%10s%10s\n", x.getMaNv(), x.getTenNv(), x.getTuoi(), x.getSoNgaycong(), x.getSalary());
    }
}
