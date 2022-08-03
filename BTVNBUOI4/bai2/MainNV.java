import java.util.Scanner;

public class MainNV {

    public static void main(String[] args) {
        NhanVien[] a = new NhanVien[5];
        for (int i = 0; i < 5; i++) {
            a[i] = nhap(a[i]);
        }
        System.out.printf("%35s%n","THONG TIN CAC NHAN VIEN");
        System.out.printf("%10s%10s%10s%10s%10s\n", "Manv", "Tennv", "Tuoi", "DiaChi", "BoPhan");
        for (int i = 0; i < 5; i++) {
            xuat(a[i]);
        }
    }

    private static NhanVien nhap(NhanVien x) {
        Scanner read = new Scanner(System.in);
        x = new NhanVien();
        System.out.print("Nhập tên nhân viên: ");
        x.setTenNv(read.next());
        System.out.print("Nhập tuổi: ");
        x.setTuoi(read.nextInt());
        System.out.print("Nhập địa chỉ: ");
        x.setDiaChi(read.next());
        System.out.print("Nhập bộ phận: ");
        x.setBoPhan(read.next());
        return x;
    }

    private static void xuat(NhanVien x) {
        NhanVien.id();
        System.out.printf("%10d%10s%10d%10s%10s\n", x.getMaNv(), x.getTenNv(), x.getTuoi(), x.getDiaChi(), x.getBoPhan());
    }
}
