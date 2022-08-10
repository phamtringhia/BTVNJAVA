import java.util.Scanner;

public class Student {
    static Scanner scanner = new Scanner(System.in);
    private String ID, name;
    private Integer age;
    Address x;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getX() {
        return x;
    }

    public void setX(Address x) {
        this.x = x;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID: ");
        ID = scanner.nextLine();
        System.out.println("Nhập name: ");
        name = scanner.nextLine();
        System.out.println("Nhập age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        x = new Address();
        x.input();
    }

    public void output() {
        System.out.print(ID+"  "+name+"  "+age+"    ");
        x.output();
    }
}
