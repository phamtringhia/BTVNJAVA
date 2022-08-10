import java.util.Scanner;

public class MainStudent {
    static Scanner sc = new Scanner(System.in);
    static int n;

    public static void Search(Student a[], int n) {
        System.out.println("Nhập ID sinh viên: ");
        sc.nextLine();
        String b = sc.nextLine();
        System.out.println("Kết quả tìm kiếm: ");
        System.out.println("ID"+"    "+"Tên"+"  "+"Tuổi"+"   "+"id"+"      "+"Huyện"+"       "+"Tỉnh");
        for (int i = 0; i < n; i++) {
            if (a[i].getID().equalsIgnoreCase(b))
                a[i].output();
        }
    }

    public static void Change(Student a[], int n) {
        for (int i = 0; i < n; i++) {
            a[i].x.setProvince((a[i].x.getProvince().replaceAll("Thanh Hóa","Hải Phòng")));
        }
    }

    public static void Remove(Student a[], int n) {
        System.out.println("Nhập ID sinh viên cần xóa: ");
        String c = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (a[i].getID().equalsIgnoreCase(c)) {
                for (int j = i; j < n - 1; j++) {
                    a[j] = a[j + 1];
                }
                i--;
                n--;
            }
        }
    }


    public static void main(String[] args) {
        Student a[];
        System.out.println("Nhập số lượng sinh viên: ");
        n = sc.nextInt();
        a = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i+1) + ": ");
            a[i] = new Student();
            a[i].input();
        }
        System.out.println("================DANH SÁCH SINH VIÊN=================");
        System.out.println("ID"+"    "+"Tên"+"  "+"Tuổi"+"   "+"id"+"      "+"Huyện"+"       "+"Tỉnh");
        for (int i = 0; i < n; i++) {
            a[i].output();
        }
        Search(a, n);
        Change(a, n);
        System.out.println("================DANH SÁCH SINH VIÊN=================");
        System.out.println("ID"+"    "+"Tên"+"  "+"Tuổi"+"   "+"id"+"      "+"Huyện"+"       "+"Tỉnh");
        for (int i = 0; i < n; i++) {
            a[i].output();
        }
        Remove(a, n);
        n--;
        System.out.println("================DANH SÁCH SINH VIÊN=================");
        System.out.println("ID"+"    "+"Tên"+"  "+"Tuổi"+"   "+"id"+"      "+"Huyện"+"       "+"Tỉnh");
        for (int i = 0; i < n; i++) {
            a[i].output();
        }
    }
}
