public class Employee {
    private String idNv, tenNv;
    private static Integer maNv = 0;
    private Integer tuoi, soNgaycong;
    private Double salary;
    private final Integer PRICE = 50;

    public Employee() {
    }

    static void id() {
        maNv++;
    }
    public Employee(String idNv, String tenNv, Integer tuoi, Integer soNgaycong, Double salary) {
        this.idNv = idNv;
        this.tenNv = tenNv;
        this.tuoi = tuoi;
        this.soNgaycong = soNgaycong;
        this.salary = salary;
    }

    public String getIdNv() {
        return idNv;
    }

    public void setIdNv(String idNv) {
        this.idNv = idNv;
    }

    public String getTenNv() {
        return tenNv;
    }

    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }

    public static Integer getMaNv() {
        return maNv;
    }

    public static void setMaNv(Integer maNv) {
        Employee.maNv = maNv;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public Integer getSoNgaycong() {
        return soNgaycong;
    }

    public void setSoNgaycong(Integer soNgaycong) {
        this.soNgaycong = soNgaycong;
    }

    public Double getSalary() {
        return soNgaycong * PRICE * 1.0;
    }


    public Integer getPRICE() {
        return PRICE;
    }
}