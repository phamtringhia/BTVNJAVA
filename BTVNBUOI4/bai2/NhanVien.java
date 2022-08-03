public class NhanVien {
    private String tenNv, diaChi, boPhan;
    private static Integer maNv = 0;
    private Integer tuoi;

    public NhanVien() {
    }
    static void id() {
        maNv++;
    }
    public NhanVien(String tenNv, String diaChi, String boPhan, Integer tuoi) {
        this.tenNv = tenNv;
        this.diaChi = diaChi;
        this.boPhan = boPhan;
        this.tuoi = tuoi;
    }

    public Integer getMaNv() {
        return maNv;
    }

    public void setMaNv(Integer maNv) {
        this.maNv = maNv;
    }

    public String getTenNv() {
        return tenNv;
    }

    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getBoPhan() {
        return boPhan;
    }

    public void setBoPhan(String boPhan) {
        this.boPhan = boPhan;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }
}
