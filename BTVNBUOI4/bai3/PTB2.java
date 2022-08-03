import java.util.Scanner;

public class PTB2 {
    private static Scanner scanner = new Scanner(System.in);
    private float a;
    private float b;
    private float c;
    public void input() {
        System.out.println("Nhap a: ");
        a = scanner.nextFloat();
        System.out.println("Nhap b: ");
        b = scanner.nextFloat();
        System.out.println("Nhap c: ");
        c = scanner.nextFloat();
    }
    public void output() {
        
        System.out.println(a + "X^2 + " + b + "X + " + c + " = 0");
    }
    public static void test(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("PT vo nghiem!");
            } else {
                System.out.println("PT co 1 nghiem: X = " + (-c / b));
            }
            return;
        }
        float delta = b * b - 4 * a * c;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("PT co 2 nghiem phan biet la: X1 = " + x1 + " va X2 = " + x2);
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("Pt co nghiem kep la: X1 = X2 = " + x1);
        } else {
            System.out.println("PT vo nghiem!");
        }
    }
    public static void main(String[] args) {
        PTB2 ptb2 = new PTB2();
        ptb2.input();
        ptb2.output();
        test(ptb2.a, ptb2.b, ptb2.c);
    }
}

