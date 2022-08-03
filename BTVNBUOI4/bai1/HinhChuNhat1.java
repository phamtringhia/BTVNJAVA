import java.util.Scanner;

public class HinhChuNhat1 {
//    C1
    private float LENGTH;
    private float WIDTH;
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        LENGTH = scanner.nextFloat();
        System.out.println("Nhap chieu rong: ");
        WIDTH = scanner.nextFloat();
    }
    public void output() {
        System.out.println("Chieu dai: " + LENGTH);
        System.out.println("Chieu rong: " + WIDTH);
    }
    public float area() {
        return LENGTH * WIDTH;
    }
    public float perimeter() {
        return (LENGTH + WIDTH) * 2;
    }
    public static void main(String[] args) {
        HinhChuNhat1 rectangle1 = new HinhChuNhat1();
        HinhChuNhat1 rectangle2 = new HinhChuNhat1();
        rectangle1.input();
        rectangle2.input();
        System.out.println("Chieu dai va chieu rong cua hinh chu nhat a: ");
        rectangle1.output();
        System.out.println("Chieu dai va chieu rong cua hinh chu nhat b: ");
        rectangle2.output();
        System.out.println("Dien tich cua hinh chu nhat a: " + rectangle1.area());
        System.out.println("Chu vi cua hinh chu nhat a: " + rectangle1.perimeter());
        System.out.println("Dien tich cua hinh chu nhat b: " + rectangle2.area());
        System.out.println("Chu vi cua hinh chu nhat b: " + rectangle2.perimeter());
        System.out.println("So sanh dien tich 2 hinh chu nhat: ");
        if (rectangle1.area() > rectangle2.area())
            System.out.println("Hinh chu nhat a co dien tich lon hon");
        else if (rectangle1.area() < rectangle2.area())
            System.out.println("Hinh chu nhat b co dien tich lon hon");
        else
            System.out.println("2 hinh chu nhat bang nhau");
    }
}


