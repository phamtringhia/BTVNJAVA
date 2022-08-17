import java.util.Scanner;

public class QLCB {
    public static int n, m, c;
    public static void inputcn(CongNhan[] congNhans) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng cán bộ công nhân: ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Cán bộ thứ " + (i + 1) + ": ");
            congNhans[i] = new CongNhan();
            congNhans[i].inputCongNhan();
        }
    }

    public static void inputks(KySu[] kySus) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng cán bộ kỹ sư: ");
        m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.println("Cán bộ thứ " + (i + 1) + ": ");
            kySus[i] = new KySu();
            kySus[i].inputKySu();
        }
    }

    public static void inputnv(NhanVien[] nhanViens) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng cán bộ nhân viên: ");
        c = scanner.nextInt();
        for (int i = 0; i < c; i++) {
            System.out.println("Cán bộ thứ " + (i + 1) + ": ");
            nhanViens[i] = new NhanVien();
            nhanViens[i].inputNhanVien();
        }
    }

    public static void showcn(CongNhan[] congNhans) {
        for (int i = 0; i < n; i++) {
            congNhans[i].ShowCongNhan();
        }
    }

    public static void showks(KySu[] kySus) {
        for (int i = 0; i < m; i++) {
            kySus[i].ShowKySu();
        }
    }

    public static void shownv(NhanVien[] nhanViens) {
        for (int i = 0; i < c; i++) {
            nhanViens[i].ShowNhanVien();
        }
    }
    //xoa theo id
    public static void delete(CongNhan[] congNhans, KySu[] kySus, NhanVien[] nhanViens) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id cần xóa: ");
        int ID = scanner.nextInt();
        for (int i = 0; i < n; i++){
            if(congNhans[i].id == ID)
                for(int j = i; j < n; j++) {
                    congNhans[j] = congNhans[j+1];
                    n--;
                }
        }
        for (int i = 0; i < m; i++){
            if(kySus[i].id == ID)
                for(int j = i; j < m; j++) {
                    kySus[j] = kySus[j+1];
                    m--;
                }
        }
        for (int i = 0; i < c; i++){
            if(nhanViens[i].id == ID)
                for (int j = i; j < c; j++) {
                    nhanViens[j] = nhanViens[j+1];
                    c--;
                }
        }
    }
    //tim kiem theo id
    public static void search(CongNhan[] congNhans, KySu[] kySus, NhanVien[] nhanViens){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id cần tìm: ");
        int ID = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if(congNhans[i].id == ID)
                congNhans[i].ShowCongNhan();
        }
        for (int i = 0; i < m; i++) {
            if(kySus[i].id == ID)
                kySus[i].ShowKySu();
        }
        for (int i = 0; i < c; i++){
            if(nhanViens[i].id == ID)
                nhanViens[i].ShowNhanVien();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CongNhan[] congNhans = new CongNhan[100];
        KySu[] kySus = new KySu[100];
        NhanVien[] nhanViens = new NhanVien[100];
        int choose;
        do {
            System.out.println("\t\t\tMENU");
            System.out.println("1: Add 1 cán bộ vào List tương ứng");
            System.out.println("2: Hiển thị danh sách các cán bộ");
            System.out.println("3: Xóa 1 cán bộ theo id");
            System.out.println("4: Tìm kiếm 1 cán bộ theo id");
            System.out.println("5: Dừng chương trình");
            System.out.println("Nhập vào lựa chọn của bạn: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1: {
                    inputcn(congNhans);
                    inputks(kySus);
                    inputnv(nhanViens);
                    break;
                }

                case 2: {
                    System.out.println("===========DANH SACH========");
                    showcn(congNhans);
                    showks(kySus);
                    shownv(nhanViens);
                    break;
                }

                case 3: {
                    System.out.println("===========DANH SACH========");
                    delete(congNhans, kySus, nhanViens);
                    showcn(congNhans);
                    showks(kySus);
                    shownv(nhanViens);
                    break;
                }

                case 4: {
                    search(congNhans, kySus, nhanViens);
                    break;
                }
//
                case 5: {
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình");
                    return;
                }
                default: {
                    System.out.println("Không có chức năng này!");
                    break;
                }
            }
        } while (true);
    }

}
