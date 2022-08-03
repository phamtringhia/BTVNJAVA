import java.util.Scanner;

public class HinhChuNhat2 {
    private float LENGTH;
    private float WIDTH;
    public float getLength() {
        return LENGTH;
    }
    public void setLength(float lengths) {
        LENGTH = lengths;
    }
    public float getWidth() {
        return WIDTH;
    }
    public void setWidth(float widths) {
        WIDTH = widths;
    }
    public float area() {
        return LENGTH * WIDTH;
    }
    public float perimeter() {
        return (LENGTH + WIDTH) * 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HinhChuNhat2 rectangle1 = new HinhChuNhat2();
        HinhChuNhat2 rectangle2 = new HinhChuNhat2();
        rectangle1.setLength(10.5f);
        System.out.println("Chieu dai cua hcn a: " + rectangle1.getLength());
        rectangle1.setWidth(9);
        System.out.println("Chieu rong cua hcn a: " + rectangle1.getWidth());
        rectangle2.setLength(13.5f);
        System.out.println("Chieu dai cua hcn b: " + rectangle2.getLength());
        rectangle2.setWidth(8.5f);
        System.out.println("Chieu rong cua hcn b: " + rectangle2.getWidth());
        System.out.println("Dien tich va chu vi cua hinh chu nhat a lan luot la " + rectangle1.area() + " va " + rectangle1.perimeter());
        System.out.println("Dien tich va chu vi cua hinh chu nhat b lan luot la " + rectangle2.area() + " va " + rectangle2.perimeter());
        System.out.println("So sanh dien tich 2 hinh chu nhat: ");
        if (rectangle1.area() > rectangle2.area())
            System.out.println("Hinh chu nhat a co dien tich lon hon");
        else if (rectangle1.area() < rectangle2.area())
            System.out.println("Hinh chu nhat b co dien tich lon hon");
        else
            System.out.println("2 hinh chu nhat bang nhau");
    }
}
