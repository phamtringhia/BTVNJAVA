import java.util.Scanner;

public class Address {
    private Integer id;
    private String district, province;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập district: ");
        district = scanner.nextLine();
        System.out.println("Nhập province: ");
        province = scanner.nextLine();
    }

    public void output() {
        System.out.println(id+ "   "+district+"   "+province);
    }
}
