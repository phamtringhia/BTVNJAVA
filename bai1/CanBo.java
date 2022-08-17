import java.util.Scanner;

public class CanBo {
    protected Integer id, NamSinh;
    protected String Fullname, Gender, Address;
    public CanBo() {
    }

    public CanBo(Integer id, Integer namSinh, String fullname, String gender, String address) {
        this.id = id;
        this.NamSinh = namSinh;
        this.Fullname = fullname;
        this.Gender = gender;
        this.Address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(Integer namSinh) {
        NamSinh = namSinh;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}

