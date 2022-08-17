import java.util.Scanner;

public class DangKyXe {
    private String Tenchuxe;
    private String Loaixe;
    private float dungtich;
    private float giatien;
    private float giacantra;
    public static int n;

    public DangKyXe() {
    }

    public DangKyXe(String tenchuxe, String loaixe, float dungtich, float giatien, float giacantra) {
        Tenchuxe = tenchuxe;
        Loaixe = loaixe;
        this.dungtich = dungtich;
        this.giatien = giatien;
        this.giacantra = giacantra;
    }

    public String getTenchuxe() {
        return Tenchuxe;
    }

    public void setTenchuxe(String tenchuxe) {
        Tenchuxe = tenchuxe;
    }

    public String getLoaixe() {
        return Loaixe;
    }

    public void setLoaixe(String loaixe) {
        Loaixe = loaixe;
    }

    public float getDungtich() {
        return dungtich;
    }

    public void setDungtich(float dungtich) {
        this.dungtich = dungtich;
    }

    public float getGiatien() {
        return giatien;
    }

    public void setGiatien(float giatien) {
        this.giatien = giatien;
    }

    public float getGiacantra() {
        return giacantra;
    }

    public void setGiacantra(float giacantra) {
        this.giacantra = giacantra;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên chủ xe:");
        Tenchuxe = scanner.nextLine();
        System.out.println("Nhập loại xe:");
        Loaixe = scanner.nextLine();
        System.out.println("Nhập dung tích:");
        dungtich = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giá tiền:");
        giatien = Integer.parseInt(scanner.nextLine());
    }
    public  void xuat(){
        System.out.println(Tenchuxe+"      "+Loaixe+"      "+dungtich+"      "+giatien+"     "+tinhtien());
    }

    //tinh gia tien
    public  double tinhtien(){

        if(dungtich<100)
            return giatien * 2 / 100;
        else if(dungtich >=100 && dungtich <=200)
            return giatien * 6 / 100;
        else
            return giatien * 10 / 100;

    }
    //thue giam dan
    public static void giamdan(DangKyXe a[], int n){
        DangKyXe tg = a[0];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i].tinhtien()<a[j].tinhtien())
                {
                    tg = a[i];
                    a[i]=a[j];
                    a[j]=tg;
                }
            }
        }
    }
    public static void tangdan(DangKyXe a[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
            {
                if(a[i].giatien > a[j].giatien)
                {
                    DangKyXe tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DangKyXe a[];
        int n;
        System.out.println("Nhập n thông tin xe:");
        n = scanner.nextInt();
        a = new DangKyXe[n];
        for(int i=0;i<n;i++){
            a[i]=new DangKyXe();
            a[i].nhap();
        }
        System.out.println("=============BẢNG KÊ KHAI============");
        System.out.println("Tên chủ xe"+" "+"Loại xe"+" "+"Dung tích"+" "+"Giá tiền"+" "+"Tiền thuê");
        for(int i=0;i<n;i++){
            a[i].xuat();
        }
        giamdan(a,n);
        System.out.println("=============BẢNG KÊ KHAI GIẢM DẦN TIỀN THUÊ============");
        System.out.println("Tên chủ xe"+" "+"Loại xe"+" "+"Dung tích"+" "+"Giá tiền"+" "+"Tiền thuê");
        for(int i=0;i<n;i++){
            a[i].xuat();
        }
        tangdan(a,n);
        System.out.println("=============BẢNG KÊ KHAI TĂNG DẦN TRỊ GIÁ============");
        System.out.println("Tên chủ xe"+" "+"Loại xe"+" "+"Dung tích"+" "+"Giá tiền"+" "+"Tiền thuê");
        for(int i=0;i<n;i++){
            a[i].xuat();
        }

    }
}
